package ru.perm.v.stat.results;

import java.util.Objects;

public class ResultSummaryWeightByGrp {
    private String grp = "";
    private Long summary = 0L;

    public ResultSummaryWeightByGrp() {
    }

    public ResultSummaryWeightByGrp(String grp, Long summary) {
        this();
        this.grp = grp;
        this.summary = summary;
    }

    public Long getSummary() {
        return summary;
    }

    public void setSummary(Long summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultSummaryWeightByGrp that = (ResultSummaryWeightByGrp) o;
        return Objects.equals(grp, that.grp) && Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grp, summary);
    }
}
