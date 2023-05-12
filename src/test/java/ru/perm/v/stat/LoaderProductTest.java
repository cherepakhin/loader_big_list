package ru.perm.v.stat;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.loader.LoaderProduct;

import static org.junit.jupiter.api.Assertions.assertThrows;

class LoaderProductTest {

    @Test
    void fileNotFoundForUnknownExtensionTest() {
        LoaderProduct loader = new LoaderProduct();
        assertThrows(Exception.class, () -> loader.readFromFile(""));
    }
}