package ru.perm.v.stat;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ObjectMapper mapper = new ObjectMapper();
        while (true) {
            String file = "";
            System.out.print("Enter path file for load (csv/json). Type \"exit\" for quit: ");
            file = in.next();
            if (file.equals("exit")) {
                exit(0);
            }
            LoaderStat loaderStat = new LoaderStat();
            try {
                long startTime = System.currentTimeMillis();

                // process
                List<Stat> stat = loaderStat.readFromFile(file);

                long timeElapsed = System.currentTimeMillis() - startTime;
                // write result
                FileUtils.writeStringToFile(new File("result.txt"), mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stat), Charset.defaultCharset());
                // print result
                System.out.printf("Writed to file \"result.txt\". Time elapsed: %s ms\n", timeElapsed);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
