package ru.perm.v.stat.results;


import java.util.Objects;

public class ResultMain {
    private ResultDuplicates resultDuplicates;
    private ResultMinMaxWeight resultMinMaxWeight;
    private ResultSummaryWeight resultSummaryWeight;

    public ResultMain(ResultDuplicates resultDuplicates, ResultMinMaxWeight resultMinMaxWeight, ResultSummaryWeight resultSummaryWeight) {
        this.resultDuplicates = resultDuplicates;
        this.resultMinMaxWeight = resultMinMaxWeight;
        this.resultSummaryWeight = resultSummaryWeight;
    }

    public ResultDuplicates getResultDuplicates() {
        return resultDuplicates;
    }

    public ResultMinMaxWeight getResultMinMaxWeight() {
        return resultMinMaxWeight;
    }

    public ResultSummaryWeight getResultSummaryWeight() {
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
