package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ResultDuplicatesTest {

    @Test
    void getProducts() {
        String GRP = "GRP1";
        String TYPE="TYPE1";
        Product product1 = new Product();
        Long NNUM1 = 1L;
        product1.setNum(NNUM1);
        product1.setGrp(GRP);
        product1.setType(TYPE);
        Long WEIGHT1 = 1L;
        product1.setWeight(WEIGHT1);

        Product product2 = new Product();
        Long NNUM2 = 2L;
        product2.setNum(NNUM2);
        product2.setGrp(GRP);
        product2.setType(TYPE);
        Long WEIGHT2 = 2L;
        product2.setWeight(WEIGHT2);

        Duplicate duplicate = new Duplicate(GRP,TYPE,List.of(product1,product2));
        ResultDuplicates resultDuplicates = new ResultDuplicates(List.of(duplicate));

        assertEquals(1, resultDuplicates.getDuplicates().size());
        assertEquals(product1, resultDuplicates.getDuplicates().get(0).getProducts().get(0));
        assertEquals(product2, resultDuplicates.getDuplicates().get(0).getProducts().get(1));
    }
}