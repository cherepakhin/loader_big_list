package ru.perm.v.stat;

import java.io.File;
import java.util.List;

/**
 * Загрузчик данных
 */
public class LoaderStat {
    private final String JSON_EXT = ".json";
    private final String CSV_EXT = ".csv";

    /**
     * Загрузить данные из файла
     *
     * @param filePath файл json или csv
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    public List<Stat> readFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            throw new Exception(String.format("File not found %s", filePath));
        }
        if (filePath.contains(JSON_EXT)) {
            return new LoaderJsonFile(filePath).read();
        }
        if (filePath.contains(CSV_EXT)) {
            return new LoaderCsvFile(filePath).read();
        }
        throw new Exception("File extension not recognized");
    }
}
