package rios.ui;

import java.util.Scanner;

/**
 * Created by eduardoriosjr on 2/19/16.
 */
public class Console {

    private static Scanner sc = new Scanner(System.in);

    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }

    public static String getString(String prompt) {
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }
}
