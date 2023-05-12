package ru.perm.v.stat;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LoaderStatTest {

    @Test
    void fileNotFoundTest() {
        LoaderStat loader = new LoaderStat();
        assertThrows(Exception.class, () -> loader.readFromFile(""));
    }

    @Test
    void readFromFileTest() throws Exception {
        LoaderStat loader = new LoaderStat();
        List<Stat> stats = loader.readFromFile(CONST.FILE_CSV);
        assertEquals(4, stats.size());
    }

    @Test
    void readCsvTest() {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readCsv(CONST.FILE_CSV);
        assertEquals(4, data.size());

        assertEquals(new Stat("group1","type1",1L,111L), data.get(0));
        assertEquals(new Stat("group1","type1",2L,112L), data.get(1));
        assertEquals(new Stat("group2","type1",3L,213L), data.get(2));
        assertEquals(new Stat("group2","type2",4L,224L), data.get(3));
    }

    @Test
    void readJsonTest() throws IOException {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readJson(CONST.FILE_JSON);
        assertEquals(4, data.size());

        assertEquals(new Stat("grp1","type1",1L,111L), data.get(0));
        assertEquals(new Stat("grp1","type1",2L,112L), data.get(1));
        assertEquals(new Stat("grp2","type1",3L,213L), data.get(2));
        assertEquals(new Stat("grp2","type2",4L,224L), data.get(3));
    }

}