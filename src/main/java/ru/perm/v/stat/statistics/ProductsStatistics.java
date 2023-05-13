package ru.perm.v.stat.statistics;

import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.ResultDuplicates;
import ru.perm.v.stat.results.ResultMain;
import ru.perm.v.stat.results.ResultMinMaxWeight;
import ru.perm.v.stat.results.ResultSummaryWeightByGrp;

import java.util.List;

public class ProductsStatistics {
    private final List<Product> duplicates;

    public ProductsStatistics(List<Product> duplicates) {
        this.duplicates = duplicates;
    }

    public ResultMain getResultMain() {
        ResultDuplicates resultDuplicates = getDuplicates();
        ResultMinMaxWeight resultMinMaxWeight  = getResultMinMaxWeight();
        ResultSummaryWeightByGrp resultSummaryWeight  = getResultSummaryWeightByGrp();
        return new ResultMain(resultDuplicates, resultMinMaxWeight, resultSummaryWeight);
    }

    protected ResultDuplicates getDuplicates() {
        return new ResultDuplicates(duplicates);
    }

    protected ResultMinMaxWeight getResultMinMaxWeight() {
        return new ResultMinMaxWeight();
    }

    protected ResultSummaryWeightByGrp getResultSummaryWeightByGrp() {
        return new ResultSummaryWeightByGrp();
    }
}
