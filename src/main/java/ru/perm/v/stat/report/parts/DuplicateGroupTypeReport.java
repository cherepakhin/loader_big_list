package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.Product;
import ru.perm.v.stat.results.Duplicate;
import ru.perm.v.stat.results.ResultGroupTypeDuplicates;

import java.util.ArrayList;
import java.util.List;

public class DuplicateGroupTypeReport implements IPrintReport {
    private final ResultGroupTypeDuplicates resultDuplicates;
    private final String delimeterLine = "-----------------------------------------------\n";

    public DuplicateGroupTypeReport(ResultGroupTypeDuplicates resultDuplicates) {
        this.resultDuplicates = resultDuplicates;
    }

    @Override
    public List<String> getBody() {
        List<String> body = new ArrayList<>();
        body.add("==================Duplicates==================\n");
        for (Duplicate duplicate : resultDuplicates.getDuplicates()) {
            body.add(String.format("Duplicates by Group: %s and Type: %s\n", duplicate.getGrp(), duplicate.getType()));
            body.add(delimeterLine);
            for (Product product : duplicate.getProducts()) {
                body.add(String.format("Product: grp=%s, nnum=%s, type=%s, weight=%s\n",
                        duplicate.getGrp(), product.getNum(), product.getType(), product.getWeight()));
            }
            body.add(delimeterLine);
        }
        return body;
    }
}
