package ru.perm.v.stat;

/**
 * Продукт:
 *  num = 0L -  номер
 *  grp = "" - группа
 *  type  = "" - тип
 *  weight - вес
 */
public class Product {
    private Long num = 0L;
    private String grp = "";
    private String type = "";
    private Long weight = 0L;

    public Product() {
    }

    public Product(String grp, String type, Long num, Long weight) {
        this.grp = grp;
        this.type = type;
        this.num = num;
        this.weight = weight;
    }

    public String getGrp() {
        return grp;
    }

    public void setGrp(String grp) {
        this.grp = grp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product stat = (Product) o;
        return grp.equals(stat.grp) &&
                type.equals(stat.type) &&
                num.equals(stat.num) &&
                weight.equals(stat.weight);
    }

    @Override
    public int hashCode() {
        return 1;
//        return Objects.hash(grp, type, num, weight);
    }

    @Override
    public String toString() {
        return "Stat{" +
                "grp='" + grp + '\'' +
                ", type='" + type + '\'' +
                ", num=" + num +
                ", weight=" + weight +
                '}';
    }
}
