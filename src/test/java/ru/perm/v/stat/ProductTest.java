package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void defaultCreate() {
        Product product = new Product();
        assertEquals(0L, product.getNum());
        assertEquals("", product.getGrp());
        assertEquals("", product.getType());
        assertEquals(0L, product.getWeight());
    }

    @Test
    void customCreate() {
        Product product = new Product("GRP", "TYPE", 1L, 1L);
        assertEquals(1L, product.getNum());
        assertEquals("GRP", product.getGrp());
        assertEquals("TYPE", product.getType());
        assertEquals(1L, product.getWeight());
    }
}