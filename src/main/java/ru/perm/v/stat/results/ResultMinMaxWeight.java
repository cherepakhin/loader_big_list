package ru.perm.v.stat.results;

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
}
