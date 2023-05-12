package ru.perm.v.stat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaderCsvFile implements ILoaderStat {

    private final String COMMA_DELIMITER = ",";
    private String filePath;

    public LoaderCsvFile(String filePath) {
        this.filePath = filePath;
    }

    /**
     * Загрузить данные из файла CSV
     *
     * @return список данных Stat
     * @throws Exception файл не найден
     */
    public List<Stat> read() throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
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
