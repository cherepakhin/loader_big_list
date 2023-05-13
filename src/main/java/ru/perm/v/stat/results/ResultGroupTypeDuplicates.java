package ru.perm.v.stat.results;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ResultGroupTypeDuplicates {
    private List<Duplicate> duplicates = new ArrayList<>();

    public ResultGroupTypeDuplicates(List<Duplicate> duplicates) {
        this.duplicates = duplicates;
    }

    public List<Duplicate> getDuplicates() {
        return duplicates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultGroupTypeDuplicates that = (ResultGroupTypeDuplicates) o;
        return Objects.equals(duplicates, that.duplicates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duplicates);
    }
}
