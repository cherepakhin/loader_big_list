package ru.perm.v.stat.report.parts;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.results.ResultSummaryWeightByGrp;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumWeightByGrpReportTest {

    @Test
    void getBodyByDefault() {
        ResultSummaryWeightByGrp resultSummaryWeightByGrp = new ResultSummaryWeightByGrp();
        String GRP = "GRP";
        resultSummaryWeightByGrp.setGrp(GRP);

        Long SUMMARY = 100L;
        resultSummaryWeightByGrp.setSummaryWeight(SUMMARY);
        SumWeightByGrpReport sumWeightByGrpReport = new SumWeightByGrpReport(resultSummaryWeightByGrp);

        assertEquals(List.of("Summary group=GRP, weight=100\n"), sumWeightByGrpReport.getBody());
    }
}