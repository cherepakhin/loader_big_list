package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultDuplicatesTest {

    @Test
    void getProducts() {
        Product product1 = new Product();
        product1.setNum(1L);
        Product product2 = new Product();
        product2.setNum(2L);
        List<Product> products = List.of(product1, product2);

        ResultDuplicates resultDuplicates = new ResultDuplicates(products);

        assertEquals(2, resultDuplicates.getProducts().size());
        assertEquals(product1, resultDuplicates.getProducts().get(0));
        assertEquals(product2, resultDuplicates.getProducts().get(1));
    }
}