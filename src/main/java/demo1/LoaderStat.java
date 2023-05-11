package demo1;

import java.util.ArrayList;
import java.util.List;

public class LoaderStat {
    private final String JSON_EXT =".json";
    private final String CSV_EXT =".csv";

    public List<Stat> readFromFile(String path) {
        if(path.contains(JSON_EXT)) {

        }
        if(path.contains(CSV_EXT)) {

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
