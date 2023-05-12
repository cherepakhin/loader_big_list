package ru.perm.v.stat.loader;

import ru.perm.v.stat.Product;

import java.io.IOException;
import java.util.List;

public interface ILoaderProductFile {
    List<Product> read(String filePath) throws IOException;
}
