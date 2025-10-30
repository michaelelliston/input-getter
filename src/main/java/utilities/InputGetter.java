package utilities;

import java.util.Scanner;

public class InputGetter {
    private static final Scanner myScanner = new Scanner(System.in);

    public static String getString(String prompt) {
        System.out.println(prompt);
        return myScanner.nextLine().trim();
    }

    public static int getInt(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Integer.parseInt(myScanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please only enter the number values you wish to input (ex: 73).\n");
            }
        }
    }

    public static float getFloat(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Float.parseFloat(myScanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please only enter the number and decimal values you wish to input (ex: 3.14).\n");
            }
        }
    }

    public static double getDouble(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return Double.parseDouble(myScanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please only enter the number and decimal values you wish to input (ex: 73 or 3.14).\n");
            }
        }
    }

    public static char getChar(String prompt) {
        while (true) {
            System.out.println(prompt);
            try {
                return myScanner.nextLine().trim().charAt(0);
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Invalid input. Please enter only a single character.\n");
            }
        }
    }

    public static boolean getBoolean(String prompt) {
        while (true) {
            System.out.println(prompt);
            String userInput = myScanner.nextLine().trim().toLowerCase();
            if (userInput.equals("true") || userInput.equals("t") || userInput.equals("yes") || userInput.equals("y")) {
                return true;
            } else if (userInput.equals("false") || userInput.equals("f") || userInput.equals("no") || userInput.equals("n")) {
                return false;
            } else {
                System.err.println("Invalid input; please enter a valid response (true / false).\n");
            }
        }
    }
}
