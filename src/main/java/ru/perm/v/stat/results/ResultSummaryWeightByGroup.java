package ru.perm.v.stat.results;

import java.util.Objects;

public class ResultSummaryWeightByGroup {
    private String grp = "";
    private Long summaryWeight = 0L;

    public ResultSummaryWeightByGroup() {
    }

    public ResultSummaryWeightByGroup(String grp, Long summaryWeight) {
        this();
        this.grp = grp;
        this.summaryWeight = summaryWeight;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public Long getSummaryWeight() {
        return summaryWeight;
    }

    public void setSummaryWeight(Long summaryWeight) {
        this.summaryWeight = summaryWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultSummaryWeightByGroup that = (ResultSummaryWeightByGroup) o;
        return Objects.equals(grp, that.grp) && Objects.equals(summaryWeight, that.summaryWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(grp, summaryWeight);
    }
}
