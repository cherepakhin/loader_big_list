package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.Duplicate;
import ru.perm.v.stat.results.ResultDuplicates;

import java.util.ArrayList;
import java.util.List;

public class DuplicateReport implements IPrintReport {
    private final ResultDuplicates resultDuplicates;

    public DuplicateReport(ResultDuplicates resultDuplicates) {
        this.resultDuplicates = resultDuplicates;
    }

    @Override
    public List<String> getBody() {
        List<String> body = new ArrayList<>();
        body.add("Duplicate:\n");
        for (Duplicate duplicate : resultDuplicates.getDuplicates()) {
            body.add(String.format("Duplicate by Group: %s and Type: %s\n", duplicate.getGrp(),duplicate.getType()));
            for (Product product : duplicate.getProducts()) {
                body.add(String.format("Product: grp=%s, nnum=%s, type=%s, weight=%s\n",
                    duplicate.getGrp(), product.getNum(), product.getType(), product.getWeight()));
            }
        }
        return body;
    }
}
