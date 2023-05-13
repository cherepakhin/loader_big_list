package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

public class SumWeightByGrpReport implements IPrintReport{

    private final ResultMinMaxWeight resultMinMaxWeight;

    public SumWeightByGrpReport(ResultMinMaxWeight resultMinMaxWeight) {
        this.resultMinMaxWeight = resultMinMaxWeight;
    }

    @Override
    public List<String> getBody() {
        String body = String.format("Weight min=%s, max=%s",resultMinMaxWeight.getMin(), resultMinMaxWeight.getMax());
        return List.of(body);
    }
}
