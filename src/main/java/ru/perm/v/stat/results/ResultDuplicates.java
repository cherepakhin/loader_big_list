package ru.perm.v.stat.results;

import ru.perm.v.stat.Product;

import java.util.ArrayList;
import java.util.List;

public class ResultDuplicates {
    List<Product> products = new ArrayList<>();

    public ResultDuplicates(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }
}
