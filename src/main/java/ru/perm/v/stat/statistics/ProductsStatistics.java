package ru.perm.v.stat.statistics;

import ru.perm.v.stat.results.*;

import java.util.List;

public class ProductsStatistics {
    private final List<Duplicate> duplicates;
    private final ResultMinMaxWeight resultMinMaxWeight;
    private final ResultSummaryWeightByGrp resultSummaryWeight;

    public ProductsStatistics(List<Duplicate> duplicates,
                              ResultSummaryWeightByGrp resultSummaryWeight,
                              ResultMinMaxWeight resultMinMaxWeight
                              ) {
        this.duplicates = duplicates;
        this.resultSummaryWeight = resultSummaryWeight;
        this.resultMinMaxWeight = resultMinMaxWeight;
    }

    public ResultMain getResultMain() {
        return new ResultMain(getDuplicates(), resultMinMaxWeight, resultSummaryWeight);
    }

    protected ResultDuplicates getDuplicates() {
        return new ResultDuplicates(duplicates);
    }
}
