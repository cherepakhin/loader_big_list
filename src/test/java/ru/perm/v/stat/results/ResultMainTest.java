package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ResultMainTest {

    Long MIN_WEIGHT = 1L;
    Long MAX_WEIGHT = 100L;
    Long SUM_WEIGHT = 10L;

    @Test
    void createDefault() {
        ResultGroupTypeDuplicates resultDuplicates = new ResultGroupTypeDuplicates(new ArrayList<>());
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        ResultSummaryWeightByGroup resultSummaryWeight = new ResultSummaryWeightByGroup();

        ResultMain resultMain = new ResultMain(resultDuplicates, resultMinMaxWeight, resultSummaryWeight);

        assertEquals(resultDuplicates, resultMain.getResultDuplicates());
        assertEquals(resultMinMaxWeight, resultMain.getResultMinMaxWeight());
        assertEquals(resultSummaryWeight, resultMain.getResultSummaryWeight());
    }

    @Test
    void createCustom() {
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
        ResultGroupTypeDuplicates resultDuplicates = new ResultGroupTypeDuplicates(Arrays.asList((duplicate)));

        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        resultMinMaxWeight.setMin(MIN_WEIGHT);
        resultMinMaxWeight.setMax(MAX_WEIGHT);

        ResultSummaryWeightByGroup resultSummaryWeight = new ResultSummaryWeightByGroup();
        resultSummaryWeight.setSummaryWeight(SUM_WEIGHT);

        ResultMain resultMain = new ResultMain(resultDuplicates, resultMinMaxWeight, resultSummaryWeight);

        assertEquals(resultDuplicates, resultMain.getResultDuplicates());
        assertEquals(resultMinMaxWeight, resultMain.getResultMinMaxWeight());
        assertEquals(resultSummaryWeight, resultMain.getResultSummaryWeight());
        assertEquals(SUM_WEIGHT, resultMain.getResultSummaryWeight().getSummaryWeight());
    }
}