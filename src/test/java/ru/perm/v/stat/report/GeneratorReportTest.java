package ru.perm.v.stat.report;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneratorReportTest {

    @Test
    void print() {
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

        Long MIN = 10L;
        Long MAX = 100L;
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight(MIN, MAX);

        Long SUMMURY = 1000L;
        ResultSummaryWeightByGrp resultSummaryWeight = new ResultSummaryWeightByGrp(GRP, SUMMURY);

        ResultMain resultMain = new ResultMain(
                resultDuplicates,
                resultMinMaxWeight,
                resultSummaryWeight);

        GeneratorReport generatorReport = new GeneratorReport();
        List<String> report = generatorReport.print(resultMain);
        System.out.println(report);

        assertEquals(9, report.size());
    }
}