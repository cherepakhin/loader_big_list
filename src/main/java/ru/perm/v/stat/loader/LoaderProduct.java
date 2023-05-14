package ru.perm.v.stat.loader;

import org.apache.commons.io.FilenameUtils;
import ru.perm.v.stat.Product;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Загрузчик данных
 */
public class LoaderProduct {
    private final String JSON_EXT = "json";
    private final String CSV_EXT = "csv";

    private Map<String, ILoaderProductFile> mapLoaderByExtension = new HashMap<>();

    public LoaderProduct() {
        mapLoaderByExtension.put(JSON_EXT, new LoaderJsonProductFile());
        mapLoaderByExtension.put(CSV_EXT, new LoaderCsvProductFile());
    }

    /**
     * Загрузить данные из файла
     *
     * @param filePath файл json или csv
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    public List<Product> readFromFile(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            throw new Exception(String.format("File not found %s", filePath));
        }
        String extension = FilenameUtils.getExtension(filePath); // json, csv
        if (mapLoaderByExtension.containsKey(extension)) {
            //TODO Памяти мало. Грузить порциями
            return mapLoaderByExtension.get(extension).read(filePath);
        }
        throw new Exception("File extension not recognized");
    }
}
