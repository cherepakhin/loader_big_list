package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

public class MaxMinWeightReport implements IPrintReport {
    Long minWeight = 0L;
    Long maxWeight = 0L;

    public MaxMinWeightReport(ResultMinMaxWeight resultMinMaxWeight) {

    }

    @Override
    public List<String> getBody() {
        return List.of("");
    }
}
