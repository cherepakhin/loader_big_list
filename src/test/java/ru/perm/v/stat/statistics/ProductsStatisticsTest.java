package ru.perm.v.stat.statistics;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.ResultDuplicates;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ProductsStatisticsTest {

    @Test
    void getDuplicates() {
        String GRP = "GRP";
        String TYPE = "TYPE";
        Long NUM = 100L;
        Long WEIGHT = 10L;
        Product product = new Product(GRP,TYPE,NUM, WEIGHT);
        List<Product> products = List.of(product);
        ProductsStatistics productsStatistics = new ProductsStatistics(products);
        ResultDuplicates duplicates = productsStatistics.getDuplicates();
        assertEquals(products, duplicates.getProducts());
    }
}