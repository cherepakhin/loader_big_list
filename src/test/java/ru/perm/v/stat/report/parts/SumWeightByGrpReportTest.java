package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumWeightByGrpReportTest {

    @Test
    void getBodyByDefault() {
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        SumWeightByGrpReport sumWeightByGrpReport = new SumWeightByGrpReport(resultMinMaxWeight);

        assertEquals(List.of("Weght min=0, max=0"), sumWeightByGrpReport.getBody());
    }

    @Test
    void getBodyWithValues() {
        ResultMinMaxWeight resultMinMaxWeight = new ResultMinMaxWeight();
        resultMinMaxWeight.setMin(10L);
        resultMinMaxWeight.setMax(100L);
        SumWeightByGrpReport sumWeightByGrpReport = new SumWeightByGrpReport(resultMinMaxWeight);

        assertEquals(List.of("Weght min=10, max=100"), sumWeightByGrpReport.getBody());
    }
}