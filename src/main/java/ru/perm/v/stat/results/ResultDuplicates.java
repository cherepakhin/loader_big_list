package ru.perm.v.stat.results;

import ru.perm.v.stat.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResultDuplicates {
    private List<Product> products = new ArrayList<>();

    public ResultDuplicates(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultDuplicates that = (ResultDuplicates) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
