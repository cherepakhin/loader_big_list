package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.List;

public class MaxMinWeightReport implements IPrintReport {

    ResultMinMaxWeight resultMinMaxWeight;

    public MaxMinWeightReport(ResultMinMaxWeight resultMinMaxWeight) {
        this.resultMinMaxWeight = resultMinMaxWeight;
    }

    @Override
    public List<String> getBody() {
        String body = String.format("Result min = %s max = %s ",
                resultMinMaxWeight.getMin(), resultMinMaxWeight.getMax());
        return List.of(body);
    }
}
