package ru.perm.v.stat.report;

import ru.perm.v.stat.report.parts.DuplicateReport;
import ru.perm.v.stat.report.parts.MaxMinWeightReport;
import ru.perm.v.stat.report.parts.SumWeightByGrpReport;
import ru.perm.v.stat.results.ResultMain;

import java.util.ArrayList;
import java.util.List;

public class GeneratorReport {

    public List<String> print(ResultMain resultMain) {
        List<String> mainReport = new ArrayList<>();
        mainReport.addAll(new DuplicateReport(resultMain.getResultDuplicates()).getBody());
        mainReport.addAll(new SumWeightByGrpReport(resultMain.getResultSummaryWeight()).getBody());
        mainReport.addAll(new MaxMinWeightReport(resultMain.getResultMinMaxWeight()).getBody());
        return mainReport;
    }
}
