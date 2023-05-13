package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class ResultMainTest {

    Long MIN_WEIGHT = 1L;
    Long MAX_WEIGHT = 100L;
    Long SUM_WEIGHT = 10L;

    @Test
    void createDefault() {
        ResultDuplicates resultDuplicates = new ResultDuplicates(new ArrayList<>());
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        ResultSummaryWeight resultSummaryWeight = new ResultSummaryWeight();

        ResultMain resultMain = new ResultMain(resultDuplicates,resultMinMaxWeight,resultSummaryWeight);

        assertEquals(resultDuplicates, resultMain.getResultDuplicates());
        assertEquals(resultMinMaxWeight, resultMain.getResultMinMaxWeight());
        assertEquals(resultSummaryWeight, resultMain.getResultSummaryWeight());
    }

    @Test
    void createCustom() {
        ResultDuplicates resultDuplicates = new ResultDuplicates(new ArrayList<>());
        resultDuplicates.products = List.of(new Product());

        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        resultMinMaxWeight.setMin(MIN_WEIGHT);
        resultMinMaxWeight.setMax(MAX_WEIGHT);

        ResultSummaryWeight resultSummaryWeight = new ResultSummaryWeight();
        resultSummaryWeight.setSummary(SUM_WEIGHT);

        ResultMain resultMain = new ResultMain(resultDuplicates,resultMinMaxWeight,resultSummaryWeight);

        assertEquals(resultDuplicates, resultMain.getResultDuplicates());
        assertEquals(resultMinMaxWeight, resultMain.getResultMinMaxWeight());
        assertEquals(resultSummaryWeight, resultMain.getResultSummaryWeight());
    }
}