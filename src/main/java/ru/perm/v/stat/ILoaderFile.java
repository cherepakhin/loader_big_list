package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderFile {
    List<Stat> readJson(String path) throws IOException;
    List<Stat> readCsv(String path) throws IOException;
}
