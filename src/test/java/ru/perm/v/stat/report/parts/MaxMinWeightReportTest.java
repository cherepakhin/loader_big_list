package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinWeightReportTest {

    @Test
    void getBody() {
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        resultMinMaxWeight.setMin(10L);
        resultMinMaxWeight.setMax(100L);
        MaxMinWeightReport maxMinWeightReport = new MaxMinWeightReport(resultMinMaxWeight);

        assertEquals(List.of("Result min = 10 max = 100"), maxMinWeightReport.getBody());
    }
}