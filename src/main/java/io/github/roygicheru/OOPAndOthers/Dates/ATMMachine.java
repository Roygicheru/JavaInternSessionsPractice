package io.github.roygicheru.OOPAndOthers.Dates;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Set the language here! Try changing this to Locale.FRENCH or Locale.US
        Locale locale = Locale.CHINESE;

        int choice = 0;
        do {
            // 2. This grabs the translation based on the locale you set above
            System.out.println(getProperty(locale, "welcome"));
            System.out.println(getProperty(locale, "deposit"));
            System.out.println(getProperty(locale, "withdraw"));
            System.out.println(getProperty(locale, "balance"));
            System.out.println(getProperty(locale, "exit"));
            System.out.println("Enter your choice: ");

            choice = input.nextInt();
        } while (choice != 4);
    }

    public static String getProperty(Locale locale, String key) {
        // 3. This tells Java: "Go find the files that start with 'ATM'"
        ResourceBundle rb = ResourceBundle.getBundle("ATM", locale);
        return rb.getString(key);
    }
}
