package utilities;

import java.util.Scanner;

public class InputGetter {
    private static final Scanner myScanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        return myScanner.nextLine().trim();
    }

    public static int getInt(String prompt) {
        System.out.println(prompt);
        try {
            return Integer.parseInt(myScanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.err.println("An error occurred while parsing your input: " + e);
            return 0;
        }
    }

    public static float getFloat(String prompt) {
        System.out.println(prompt);
        try {
            return Float.parseFloat(myScanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.err.println("An error occurred while parsing your input: " + e);
            return 0;
        }
    }
}
