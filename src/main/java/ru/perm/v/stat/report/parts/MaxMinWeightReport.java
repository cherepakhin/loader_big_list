package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultMinMaxWeight;

import java.util.ArrayList;
import java.util.List;

public class MaxMinWeightReport implements IPrintReport {

    private final ResultMinMaxWeight resultMinMaxWeight;

    public MaxMinWeightReport(ResultMinMaxWeight resultMinMaxWeight) {
        this.resultMinMaxWeight = resultMinMaxWeight;
    }

    @Override
    public List<String> getBody() {
        List<String> body = new ArrayList<>();
        body.add("MaxMinWeight:\n");
        body.add(String.format("Result min = %s max = %s\n",
                resultMinMaxWeight.getMin(), resultMinMaxWeight.getMax()));
        return body;
    }
}
