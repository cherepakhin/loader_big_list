package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

public class SumWeightByGrpReport implements IPrintReport{

    public SumWeightByGrpReport(ResultMinMaxWeight resultMinMaxWeight) {
    }

    @Override
    public List<String> getBody() {
        return List.of("");
    }
}
