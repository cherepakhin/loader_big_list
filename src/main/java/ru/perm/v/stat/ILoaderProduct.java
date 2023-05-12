package ru.perm.v.stat;

import java.io.IOException;
import java.util.List;

public interface ILoaderProduct {
    List<Product> read(String filePath) throws IOException;
}
