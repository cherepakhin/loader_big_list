package ru.perm.v.stat;

import org.junit.jupiter.api.Test;
import ru.perm.v.stat.loader.LoaderCsvProductFile;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderCsvProductFileTest {

    @Test
    void readTest() throws IOException {
        LoaderCsvProductFile loader = new LoaderCsvProductFile();
        List<Product> data = loader.read(CONSTS_FOR_TESTS.FILE_CSV);
        assertEquals(4, data.size());

        assertEquals(new Product("group1", "type1", 1L, 111L), data.get(0));
        assertEquals(new Product("group1", "type1", 2L, 112L), data.get(1));
        assertEquals(new Product("group2", "type1", 3L, 213L), data.get(2));
        assertEquals(new Product("group2", "type2", 4L, 224L), data.get(3));
    }
}