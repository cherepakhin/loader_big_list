package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LoaderStatTest {

    @Test
    void fileNotFoundTest() {
        LoaderStat loader = new LoaderStat();
        assertThrows(Exception.class, () -> loader.readFromFile(""));
    }
}