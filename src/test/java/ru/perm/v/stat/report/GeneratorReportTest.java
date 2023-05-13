package ru.perm.v.stat.report;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.ResultDuplicates;
import ru.perm.v.stat.results.ResultMain;
import ru.perm.v.stat.results.ResultMinMaxWeight;
import ru.perm.v.stat.results.ResultSummaryWeightByGrp;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GeneratorReportTest {

    @Test
    void print() {
        Long NNUM = 10L;
        String GRP = "GRP10";
        String TYPE = "TYPE10";
        Long WEIGHT = 100L;

        List<Product> products = List.of(new Product(GRP, TYPE, NNUM, WEIGHT));
        ResultDuplicates resultDuplicates = new ResultDuplicates(products);

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

        assertEquals(5, report.size());
//        assertEquals(List.of(""), report);
    }
}