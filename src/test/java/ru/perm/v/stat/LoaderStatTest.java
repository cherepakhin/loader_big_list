package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LoaderStatTest {

    @Test
    void fileNotFoundTest() {
        LoaderProduct loader = new LoaderProduct();
        assertThrows(Exception.class, () -> loader.readFromFile(""));
    }
}