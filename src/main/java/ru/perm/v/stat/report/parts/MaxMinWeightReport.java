package ru.perm.v.stat.report.parts;

import java.util.List;

public class MaxMinWeightReport implements IPrintReport{
    Long minWeight = 0L;
    Long maxWeight = 0L;

    @Override
    public List<String> print() {
        return List.of("");
    }
}
