package ru.perm.v.stat.results;


public class ResultMain {
    ResultDuplicates resultDuplicates;
    ResultMinMaxWeight resultMinMaxWeight;
    ResultSummaryWeight resultSummaryWeight;

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
}
