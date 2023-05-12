package ru.perm.v.stat;

public class Report {
    private Integer countDublicate = 0;
    private Integer sumWeight = 0;
    private Integer minWeight = 0;
    private Integer maxWeight = 0;

    public Report(Integer countDublicate, Integer sumWeight, Integer minWeight, Integer maxWeight) {
        this.countDublicate = countDublicate;
        this.sumWeight = sumWeight;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public Integer getCountDublicate() {
        return countDublicate;
    }

    public void setCountDublicate(Integer countDublicate) {
        this.countDublicate = countDublicate;
    }

    public Integer getSumWeight() {
        return sumWeight;
    }

    public void setSumWeight(Integer sumWeight) {
        this.sumWeight = sumWeight;
    }

    public Integer getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(Integer minWeight) {
        this.minWeight = minWeight;
    }

    public Integer getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(Integer maxWeight) {
        this.maxWeight = maxWeight;
    }
}
