package ru.perm.v.stat.report;

import ru.perm.v.stat.report.parts.DuplicateGroupTypeReport;
import ru.perm.v.stat.report.parts.MaxMinWeightReport;
import ru.perm.v.stat.report.parts.SumWeightByGroupReport;
import ru.perm.v.stat.results.ResultMain;

import java.util.ArrayList;
import java.util.List;

public class GeneratorReport {
    ResultMain resultMain;

    public GeneratorReport(ResultMain resultMain) {
        this.resultMain = resultMain;
    }

    public List<String> getReportStrings() {
        List<String> mainReport = new ArrayList<>();
        mainReport.addAll(new DuplicateGroupTypeReport(resultMain.getResultDuplicates()).getBody());
        mainReport.addAll(new SumWeightByGroupReport(resultMain.getResultSummaryWeight()).getBody());
        mainReport.addAll(new MaxMinWeightReport(resultMain.getResultMinMaxWeight()).getBody());
        return mainReport;
    }
}
