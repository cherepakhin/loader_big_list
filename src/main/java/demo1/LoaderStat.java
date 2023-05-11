package demo1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LoaderStat {
    private final String JSON_EXT = ".json";
    private final String CSV_EXT = ".csv";

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

    public List<Stat> readJson(String path) {
        List<Stat> data = new ArrayList<>();
        return data;
    }

    public List<Stat> readCsv(String path) {
        List<Stat> data = new ArrayList<>();
        return data;
    }
}
