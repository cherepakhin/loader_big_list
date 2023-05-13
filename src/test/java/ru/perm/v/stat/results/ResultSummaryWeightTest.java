package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultSummaryWeightTest {
    @Test
    void createDefault() {
        ResultSummaryWeightByGrp resultSummaryWeight = new ResultSummaryWeightByGrp();
        assertEquals(0L, resultSummaryWeight.getSummaryWeight());
    }
}