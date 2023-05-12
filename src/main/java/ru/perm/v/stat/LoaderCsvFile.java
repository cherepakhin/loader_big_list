package ru.perm.v.stat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaderCsvFile implements ILoaderObj {

    private final String COMMA_DELIMITER = ",";

    public LoaderCsvFile() {
    }

    /**
     * Загрузить данные из файла CSV
     *
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    public List<ObjForLoad> read(String filePath) throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
        records.remove(0); // Удаление заголовка
        List<ObjForLoad> stats = new ArrayList<>();
        for (List<String> row : records) {
            ObjForLoad stat = new ObjForLoad();

            stat.setGrp(row.get(0));
            stat.setType(row.get(1));
            stat.setNum(Long.parseLong(row.get(2)));
            stat.setWeight(Long.parseLong(row.get(3)));
            stats.add(stat);
        }
        return stats;
    }
}
