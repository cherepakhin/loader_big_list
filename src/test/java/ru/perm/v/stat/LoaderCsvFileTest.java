package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderCsvFileTest {

    @Test
    void readTest() throws IOException {
        LoaderCsvFile loader = new LoaderCsvFile();
        List<ObjForLoad> data = loader.read(CONSTS_FOR_TESTS.FILE_CSV);
        assertEquals(4, data.size());

        assertEquals(new ObjForLoad("group1", "type1", 1L, 111L), data.get(0));
        assertEquals(new ObjForLoad("group1", "type1", 2L, 112L), data.get(1));
        assertEquals(new ObjForLoad("group2", "type1", 3L, 213L), data.get(2));
        assertEquals(new ObjForLoad("group2", "type2", 4L, 224L), data.get(3));
    }
}