package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResultSummaryWeightTest {
    @Test
    void createDefault() {
        ResultSummaryWeightByGroup resultSummaryWeight = new ResultSummaryWeightByGroup();
        assertEquals(0L, resultSummaryWeight.getSummaryWeight());
    }
}