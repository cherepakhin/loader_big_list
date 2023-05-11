package demo1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderStatTest {

    @Test
    void fileNotFoundTest() {
        LoaderStat loader = new LoaderStat();
        assertThrows(Exception.class, () -> loader.readFromFile(""));
    }

    @Test
    void readFromFileTest() throws Exception {
        LoaderStat loader = new LoaderStat();
        assertEquals(0, loader.readFromFile(CONST.FILE_CSV).size());
    }

    @Test
    void readCsvTest() {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readCsv("");
        assertEquals(0, data.size());
    }

    @Test
    void readJsonTest() {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readJson(CONST.FILE_JSON);
        assertEquals(0, data.size());
    }

}