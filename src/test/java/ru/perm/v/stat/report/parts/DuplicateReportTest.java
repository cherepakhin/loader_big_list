package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.ResultDuplicates;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateReportTest {

    @Test
    void getBody() {
        Product product1 = new Product();
        Long NNUM1 = 1L;
        product1.setNum(NNUM1);
        String GRP1 = "GRP1";
        product1.setGrp(GRP1);
        String TYPE1="TYPE1";
        product1.setType(TYPE1);
        Long WEIGHT1 = 1L;
        product1.setWeight(WEIGHT1);

        Product product2 = new Product();
        Long NNUM2 = 2L;
        product2.setNum(NNUM2);
        String GRP2 = "GRP2";
        product2.setGrp(GRP2);
        String TYPE2="TYPE2";
        product2.setType(TYPE2);
        Long WEIGHT2 = 2L;
        product2.setWeight(WEIGHT2);

        ResultDuplicates resultDuplicates = new ResultDuplicates(List.of(product1, product2));

        DuplicateReport duplicateReport = new DuplicateReport(resultDuplicates);
        List<String> body = duplicateReport.getBody();

        assertEquals(3, body.size()); // Add title
        assertEquals("Duplicate:\n", body.get(0));
        assertEquals("Product: grp=GRP1, nnum=1, type=TYPE1, weight=1", body.get(1));
        assertEquals("Product: grp=GRP2, nnum=2, type=TYPE2, weight=2", body.get(2));
    }

}