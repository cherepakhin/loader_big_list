package ru.perm.v.stat.results;

import java.util.Objects;

public class ResultSummaryWeight {
    Long summary = 0L;

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
        ResultSummaryWeight that = (ResultSummaryWeight) o;
        return Objects.equals(summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary);
    }
}
