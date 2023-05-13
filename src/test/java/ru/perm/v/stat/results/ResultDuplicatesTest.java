package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultDuplicatesTest {

    @Test
    void getProducts() {
        List<Product> products = List.of(new Product());
        ResultDuplicates resultDuplicates = new ResultDuplicates(products);
        assertEquals(1, resultDuplicates.getProducts().size());
    }
}