package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.Duplicate;
import ru.perm.v.stat.results.ResultGroupTypeDuplicates;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateGroupTypeReportTest {

    @Test
    void getBody() {
        String GRP = "GRP1";
        String TYPE = "TYPE1";
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

        Duplicate duplicate = new Duplicate(GRP, TYPE, Arrays.asList(product1, product2));
        ResultGroupTypeDuplicates resultDuplicates = new ResultGroupTypeDuplicates(Arrays.asList(duplicate));

        DuplicateGroupTypeReport duplicateReport = new DuplicateGroupTypeReport(resultDuplicates);
        List<String> body = duplicateReport.getBody();
//        System.out.println(body);
        assertEquals(6, body.size()); // Add title
        assertEquals("==================Duplicates==================\n", body.get(0));
        assertEquals("Duplicates by Group: GRP1 and Type: TYPE1\n", body.get(1));
        assertEquals("-----------------------------------------------\n", body.get(2));
        assertEquals("Product: grp=GRP1, nnum=1, type=TYPE1, weight=1\n", body.get(3));
        assertEquals("Product: grp=GRP1, nnum=2, type=TYPE1, weight=2\n", body.get(4));
    }
}