package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderCsvFileTest {

    @Test
    void readTest() throws IOException {
        LoaderCsvFile loader = new LoaderCsvFile(CONST.FILE_CSV);
        List<Stat> data = loader.read();
        assertEquals(4, data.size());

        assertEquals(new Stat("group1", "type1", 1L, 111L), data.get(0));
        assertEquals(new Stat("group1", "type1", 2L, 112L), data.get(1));
        assertEquals(new Stat("group2", "type1", 3L, 213L), data.get(2));
        assertEquals(new Stat("group2", "type2", 4L, 224L), data.get(3));
    }
}