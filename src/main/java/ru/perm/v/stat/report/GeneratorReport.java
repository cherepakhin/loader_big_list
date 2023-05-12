package ru.perm.v.stat.report;

import ru.perm.v.stat.Product;
import ru.perm.v.stat.report.parts.DuplicateReport;
import ru.perm.v.stat.report.parts.IPrintReport;
import ru.perm.v.stat.report.parts.MaxMinWeightReport;
import ru.perm.v.stat.report.parts.SumWeightByGrpReport;

import java.util.ArrayList;
import java.util.List;

public class GeneratorReport {
    private DuplicateReport duplicateReport = new DuplicateReport();
    private SumWeightByGrpReport sumWeightByGrpReport = new SumWeightByGrpReport();
    private MaxMinWeightReport maxMinWeightReport = new MaxMinWeightReport();

    public List<String> print(List<Product> products) {
        List<String> mainReport = new ArrayList<>();
        mainReport.addAll(duplicateReport.print());
        mainReport.addAll(sumWeightByGrpReport.print());
        mainReport.addAll(maxMinWeightReport.print());
        return mainReport;
    }
}
