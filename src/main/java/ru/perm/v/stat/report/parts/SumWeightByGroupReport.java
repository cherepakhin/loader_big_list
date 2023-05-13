package ru.perm.v.stat.report.parts;


import ru.perm.v.stat.results.ResultSummaryWeightByGroup;

import java.util.List;

public class SumWeightByGroupReport implements IPrintReport {

    private final ResultSummaryWeightByGroup summaryWeightByGroup;

    public SumWeightByGroupReport(ResultSummaryWeightByGroup summaryWeightByGroup) {
        this.summaryWeightByGroup = summaryWeightByGroup;
    }

    @Override
    public List<String> getBody() {
        String body = String.format("Summary group=%s, weight=%s\n",
                summaryWeightByGroup.getGrp(), summaryWeightByGroup.getSummaryWeight());
        return List.of(body);
    }
}
