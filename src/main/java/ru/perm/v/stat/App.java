package ru.perm.v.stat;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
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
                loaderStat.readFromFile(file);
                long timeElapsed = System.currentTimeMillis() - startTime;
                System.out.printf("Time elapsed: %s ms\n", timeElapsed);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
