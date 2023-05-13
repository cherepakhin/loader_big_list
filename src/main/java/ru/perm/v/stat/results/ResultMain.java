package ru.perm.v.stat.results;

import java.util.Objects;

public class ResultMain {
    private ResultGroupTypeDuplicates resultDuplicates;
    private ResultMinMaxWeight resultMinMaxWeight;
    private ResultSummaryWeightByGroup resultSummaryWeight;

    public ResultMain(ResultGroupTypeDuplicates resultDuplicates, ResultMinMaxWeight resultMinMaxWeight,
                      ResultSummaryWeightByGroup resultSummaryWeight) {
        this.resultDuplicates = resultDuplicates;
        this.resultMinMaxWeight = resultMinMaxWeight;
        this.resultSummaryWeight = resultSummaryWeight;
    }

    public ResultGroupTypeDuplicates getResultDuplicates() {
        return resultDuplicates;
    }

    public ResultMinMaxWeight getResultMinMaxWeight() {
        return resultMinMaxWeight;
    }

    public ResultSummaryWeightByGroup getResultSummaryWeight() {
        return resultSummaryWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultMain that = (ResultMain) o;
        return Objects.equals(resultDuplicates, that.resultDuplicates) && Objects.equals(resultMinMaxWeight, that.resultMinMaxWeight) && Objects.equals(resultSummaryWeight, that.resultSummaryWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultDuplicates, resultMinMaxWeight, resultSummaryWeight);
    }
}
