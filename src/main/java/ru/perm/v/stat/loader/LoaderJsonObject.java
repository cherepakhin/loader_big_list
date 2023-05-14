package ru.perm.v.stat.loader;

import org.apache.commons.io.FileUtils;
import ru.perm.v.stat.Product;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Loader JSON file only JavaSE
 */
public class LoaderJsonObject {
    public List<Product> readFromFile(String filePath) throws Exception {
        String body = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
        return null;
    }
}
