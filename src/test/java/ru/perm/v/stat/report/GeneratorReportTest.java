package ru.perm.v.stat.report;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.results.ResultDuplicates;
import ru.perm.v.stat.results.ResultMain;
import ru.perm.v.stat.results.ResultMinMaxWeight;
import ru.perm.v.stat.results.ResultSummaryWeight;

import static org.mockito.Mockito.*;

class GeneratorReportTest {

    @Test
    void print() {
        ResultDuplicates mockResultDuplicates = mock(ResultDuplicates.class) ;
        ResultMinMaxWeight mockResultMinMaxWeight = mock(ResultMinMaxWeight.class);
        ResultSummaryWeight mockResultSummaryWeight = mock(ResultSummaryWeight.class);
        ResultMain resultMain = new ResultMain(mockResultDuplicates,mockResultMinMaxWeight,mockResultSummaryWeight);

        GeneratorReport generatorReport = new GeneratorReport();
        generatorReport.print(resultMain);

        verify(mockResultDuplicates, times(1));
    }
}