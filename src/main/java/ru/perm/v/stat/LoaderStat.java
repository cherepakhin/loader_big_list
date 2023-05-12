package ru.perm.v.stat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaderStat {
    private final String JSON_EXT = ".json";
    private final String CSV_EXT = ".csv";
    private final String COMMA_DELIMITER = ",";

    public List<Stat> readFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            throw new Exception(String.format("File not found %s", filePath));
        }
        if (filePath.contains(JSON_EXT)) {
            return readJson(filePath);
        }
        if (filePath.contains(CSV_EXT)) {
            return readCsv(filePath);
        }
        return new ArrayList<>();
    }

    public List<Stat> readJson(String path) throws IOException {
        List<List<String>> records = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        TypeFactory typeFactory = mapper.getTypeFactory();
        String body = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);
        List<Stat> stats = mapper.readValue(body, new TypeReference<ArrayList<Stat>>() {});
        return stats;
    }

    public List<Stat> readCsv(String path) throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
        records.remove(0); // Удаление заголовка
        List<Stat> stats = new ArrayList<>();
        for (List<String> row : records) {
            Stat stat = new Stat();

            stat.setGrp(row.get(0));
            stat.setType(row.get(1));
            stat.setNum(Long.parseLong(row.get(2)));
            stat.setWeight(Long.parseLong(row.get(3)));
            stats.add(stat);
        }
        return stats;
    }
}
