package ru.perm.v.stat.loader;

import ru.perm.v.stat.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaderCsvProductFile implements ILoaderProductFile {

    private final String COMMA_DELIMITER = ",";

    public LoaderCsvProductFile() {
    }

    /**
     * Загрузить данные из файла CSV
     *
     * @return список продуктов
     * @throws Exception файл не найден
     */
    public List<Product> read(String filePath) throws IOException {
        List<List<String>> records = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }
        records.remove(0); // Удаление заголовка CSV
        List<Product> products = new ArrayList<>();
        for (List<String> row : records) {
            Product product = new Product();
            product.setGrp(row.get(0));
            product.setType(row.get(1));
            product.setNum(Long.parseLong(row.get(2)));
            product.setWeight(Long.parseLong(row.get(3)));
            products.add(product);
        }
        return products;
    }
}
