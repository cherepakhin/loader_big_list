package ru.perm.v.stat.results;

import ru.perm.v.stat.Product;

import java.util.ArrayList;
import java.util.List;

public class Duplicate {
    private String grp = "";
    private String type = "";
    private List<Product> products = new ArrayList<>();

    public Duplicate(String grp, String type, List<Product> products) {
        this.grp = grp;
        this.type = type;
        this.products = products;
    }

    public String getGrp() {
        return grp;
    }

    public String getType() {
        return type;
    }

    public Integer getCount() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }
}
