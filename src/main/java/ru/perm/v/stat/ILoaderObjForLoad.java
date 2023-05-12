package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderObjForLoad {
    List<DummyObj> read(String filePath) throws IOException;
}
