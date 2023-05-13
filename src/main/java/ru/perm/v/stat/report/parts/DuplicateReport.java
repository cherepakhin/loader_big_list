package ru.perm.v.stat.report.parts;

import ru.perm.v.stat.results.ResultDuplicates;

import java.util.List;

public class DuplicateReport implements IPrintReport {
    private ResultDuplicates resultDuplicates;
    public DuplicateReport(ResultDuplicates resultDuplicates) {
        this.resultDuplicates = resultDuplicates;
    }

    @Override
    public List<String> getBody() {
        return List.of("");
    }

}
