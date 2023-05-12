package ru.perm.v.stat;

public class Stat {
    private Integer countDublicate =0;
    private Integer sumWigth = 0;
    private Integer minWigth = 0;
    private Integer maxWigth = 0;

    public Stat(Integer countDublicate, Integer sumWigth, Integer minWigth, Integer maxWigth) {
        this.countDublicate = countDublicate;
        this.sumWigth = sumWigth;
        this.minWigth = minWigth;
        this.maxWigth = maxWigth;
    }

    public Integer getCountDublicate() {
        return countDublicate;
    }

    public void setCountDublicate(Integer countDublicate) {
        this.countDublicate = countDublicate;
    }

    public Integer getSumWigth() {
        return sumWigth;
    }

    public void setSumWigth(Integer sumWigth) {
        this.sumWigth = sumWigth;
    }

    public Integer getMinWigth() {
        return minWigth;
    }

    public void setMinWigth(Integer minWigth) {
        this.minWigth = minWigth;
    }

    public Integer getMaxWigth() {
        return maxWigth;
    }

    public void setMaxWigth(Integer maxWigth) {
        this.maxWigth = maxWigth;
    }
}
