package ru.perm.v.stat;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Загрузчик данных
 */
public class LoaderObj {
    private final String JSON_EXT = "json";
    private final String CSV_EXT = "csv";

    private Map<String, ILoaderObj> mapLoaderByExtension = new HashMap<>();

    public LoaderObj() {
        mapLoaderByExtension.put(JSON_EXT, new LoaderJsonFile());
        mapLoaderByExtension.put(CSV_EXT, new LoaderCsvFile());
    }

    /**
     * Загрузить данные из файла
     *
     * @param filePath файл json или csv
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    public List<ObjForLoad> readFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            throw new Exception(String.format("File not found %s", filePath));
        }
        String extension = FilenameUtils.getExtension(filePath); // json, csv
        if (mapLoaderByExtension.containsKey(extension)) {
            return mapLoaderByExtension.get(extension).read(filePath);
        }
        throw new Exception("File extension not recognized");
    }
}
