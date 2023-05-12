package ru.perm.v.stat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class LoaderJsonFile implements ILoaderStat {
    private String path;

    public LoaderJsonFile(String filePath) {
        this.path = filePath;
    }

    /**
     * Загрузить данные из файла JSON
     *
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    @Override
    public List<Stat> read() throws IOException {
        List<List<String>> records = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        TypeFactory typeFactory = mapper.getTypeFactory();
        String body = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);
        List<Stat> stats = mapper.readValue(body, new TypeReference<ArrayList<Stat>>() {
        });
        return stats;
    }
}
