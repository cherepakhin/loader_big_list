package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderJsonFileTest {

    @Test
    void readTest() throws Exception {
        LoaderStat loader = new LoaderStat();
        List<LoadObj> data = loader.readFromFile(CONSTS_FOR_TESTS.FILE_JSON);
        assertEquals(4, data.size());

        assertEquals(new LoadObj("grp1", "type1", 1L, 111L), data.get(0));
        assertEquals(new LoadObj("grp1", "type1", 2L, 112L), data.get(1));
        assertEquals(new LoadObj("grp2", "type1", 3L, 213L), data.get(2));
        assertEquals(new LoadObj("grp2", "type2", 4L, 224L), data.get(3));
    }

}