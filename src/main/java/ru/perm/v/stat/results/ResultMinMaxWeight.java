package ru.perm.v.stat.results;

import java.util.Objects;

public class ResultMinMaxWeight {
    Long min = 0L;
    Long max = 0L;

    public ResultMinMaxWeight() {
    }

    public ResultMinMaxWeight(Long min, Long max) {
        this();
        this.min = min;
        this.max = max;
    }

    public Long getMin() {
        return min;
    }

    public void setMin(Long min) {
        this.min = min;
    }

    public Long getMax() {
        return max;
    }

    public void setMax(Long max) {
        this.max = max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultMinMaxWeight that = (ResultMinMaxWeight) o;
        return Objects.equals(min, that.min) && Objects.equals(max, that.max);
    }

    @Override
    public int hashCode() {
        return Objects.hash(min, max);
    }
}
