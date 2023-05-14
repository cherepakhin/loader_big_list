package ru.perm.v.stat.loader;

import org.apache.commons.io.FileUtils;
import org.codehaus.jackson.map.util.JSONPObject;
import org.junit.jupiter.api.Test;
import ru.perm.v.stat.Product;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

class LoaderJsonObjectTest {
    @Test
    void readFromFile() throws IOException {
//        String body = FileUtils.readFileToString(new File("doc/out.json"), StandardCharsets.UTF_8);
//
//        JsonReader jsonReader = Json.createReader(body);
//        JsonObject object = jsonReader.readObject();
//        jsonReader.close();
//        System.out.println(body);
    }

    //    public List<Product> readFromFile(String filePath) throws Exception {
//        String body = FileUtils.readFileToString(new File(filePath), StandardCharsets.UTF_8);
//        return null;
//    }


//    public void String readFromFile() throws Exception {
//        LoaderJsonObject loader = new LoaderJsonObject();
//        JSONPObject json = loader.readFromFile("/doc/out.json");
//        return "";
//    }
}