package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.results.ResultSummaryWeightByGroup;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumWeightByGroupReportTest {

    @Test
    void getBodyByDefault() {
        ResultSummaryWeightByGroup resultSummaryWeightByGroup = new ResultSummaryWeightByGroup();
        String GRP = "GRP";
        resultSummaryWeightByGroup.setGrp(GRP);

        Long SUMMARY = 100L;
        resultSummaryWeightByGroup.setSummaryWeight(SUMMARY);
        SumWeightByGroupReport sumWeightByGroupReport = new SumWeightByGroupReport(resultSummaryWeightByGroup);

        assertEquals(List.of("Summary group=GRP, weight=100\n"), sumWeightByGroupReport.getBody());
    }
}