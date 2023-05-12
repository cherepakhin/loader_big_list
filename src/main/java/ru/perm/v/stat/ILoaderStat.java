package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderStat {
    List<LoadObj> read(String filePath) throws IOException;
}
