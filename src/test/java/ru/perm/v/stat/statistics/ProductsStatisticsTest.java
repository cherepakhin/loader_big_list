package ru.perm.v.stat.statistics;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.Duplicate;
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
        Duplicate duplicate = new Duplicate(GRP, TYPE, List.of(product));
        ProductsStatistics productsStatistics = new ProductsStatistics(List.of(duplicate),null, null);
        assertEquals(1, productsStatistics.getDuplicates().getDuplicates().size());
    }
}