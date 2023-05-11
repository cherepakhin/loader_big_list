package demo1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LoaderStatTest {

    @Test
    void readFromFile() {
        LoaderStat loader = new LoaderStat();
        assertEquals(0, loader.readFromFile("").size());
    }

    @Test
    void readCsv() {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readCsv("");
        assertEquals(0, data.size());
    }

    @Test
    void readJson() {
        LoaderStat loader = new LoaderStat();
        List<Stat> data = loader.readJson("");
        assertEquals(0, data.size());
    }

}