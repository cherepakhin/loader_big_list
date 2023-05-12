package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderObjForLoad {
    List<Product> read(String filePath) throws IOException;
}
