package ru.perm.v.stat;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.exit;

public class App {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter path file for load:");
        String file = in.next();
        if (file.equals("exit")) {
            exit(0);
        }
        LoaderStat loaderStat = new LoaderStat();
        try {
            loaderStat.readFromFile(file);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
