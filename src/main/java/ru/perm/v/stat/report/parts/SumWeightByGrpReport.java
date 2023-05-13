package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;
import ru.perm.v.stat.results.ResultSummaryWeightByGrp;

import java.util.List;

public class SumWeightByGrpReport implements IPrintReport {

    private final ResultSummaryWeightByGrp summaryWeightByGrp;

    public SumWeightByGrpReport(ResultSummaryWeightByGrp summaryWeightByGrp) {
        this.summaryWeightByGrp = summaryWeightByGrp;
    }

    @Override
    public List<String> getBody() {
        String body = String.format("Summary group=%s, weight=%s",
                summaryWeightByGrp.getGrp(), summaryWeightByGrp.getSummary());
        return List.of(body);
    }
}
