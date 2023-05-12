package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderObj {
    List<ObjForLoad> read(String filePath) throws IOException;
}
