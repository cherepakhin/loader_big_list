package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultDuplicatesTest {

    @Test
    void getProducts() {
        String GRP = "GRP1";
        String TYPE = "TYPE1";
        Product product1 = new Product();
        product1.setGrp(GRP);
        product1.setType(TYPE);

        Product product2 = new Product();
        product2.setGrp(GRP);
        product2.setType(TYPE);

        Duplicate duplicate = new Duplicate(GRP, TYPE, List.of(product1, product2));
        ResultDuplicates resultDuplicates = new ResultDuplicates(List.of(duplicate));

        // зафиксирован один двойник с 2 товарами с одинаковой группой и типом
        assertEquals(1, resultDuplicates.getDuplicates().size());
        assertEquals(product1, resultDuplicates.getDuplicates().get(0).getProducts().get(0));
        assertEquals(product2, resultDuplicates.getDuplicates().get(0).getProducts().get(1));
    }
}