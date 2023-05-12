package ru.perm.v.stat;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class LoaderJsonFile implements ILoaderStat {

    /**
     * Загрузить данные из файла JSON
     *
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    @Override
    public List<Stat> read(String filePath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
        String body = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
        List<Stat> stats = mapper.readValue(body, new TypeReference<ArrayList<Stat>>() {
        });
        return stats;
    }
}