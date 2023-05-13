package ru.perm.v.stat.results;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ResultMinMaxWeightTest {
    @Test
    void createDefault() {
        ResultMinMaxWeight result = new ResultMinMaxWeight();
        assertEquals(0L, result.getMin());
        assertEquals(0L, result.getMax());
    }

    @Test
    void createCustom() {
        ResultMinMaxWeight result = new ResultMinMaxWeight(10L, 100L);
        assertEquals(10L, result.getMin());
        assertEquals(100L, result.getMax());
    }
}