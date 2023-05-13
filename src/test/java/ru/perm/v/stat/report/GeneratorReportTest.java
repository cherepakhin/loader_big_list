package ru.perm.v.stat.report;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.perm.v.stat.report.parts.DuplicateReport;
import ru.perm.v.stat.report.parts.MaxMinWeightReport;
import ru.perm.v.stat.report.parts.SumWeightByGrpReport;
import ru.perm.v.stat.results.ResultDuplicates;
import ru.perm.v.stat.results.ResultMain;
import ru.perm.v.stat.results.ResultMinMaxWeight;
import ru.perm.v.stat.results.ResultSummaryWeight;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

class GeneratorReportTest {

    @Test
    void print() {
        DuplicateReport mockDuplicateReport = mock(DuplicateReport.class);
        SumWeightByGrpReport mockSumWeightByGrpReport = mock(SumWeightByGrpReport.class);
        MaxMinWeightReport maxMinWeightReport = mock(MaxMinWeightReport.class);
        ResultDuplicates mockResultDuplicates = mock(ResultDuplicates.class);
        ResultMinMaxWeight mockResultMinMaxWeight = mock(ResultMinMaxWeight.class);
        ResultSummaryWeight mockResultSummaryWeight = mock(ResultSummaryWeight.class);
        ResultMain resultMain = new ResultMain(
                mockResultDuplicates,
                mockResultMinMaxWeight,
                mockResultSummaryWeight);

        GeneratorReport generatorReport = new GeneratorReport(
                mockDuplicateReport,
                mockSumWeightByGrpReport,
                maxMinWeightReport);
        generatorReport.print(resultMain);

        //TODO
        //Mockito.verify(mockResultDuplicates, times(1)).getProducts();
    }
}