package org.example;

import java.util.Scanner;

public class User {
    private static String userInput;
    private static long userGrossIncome;
    private static double postTaxIncome;

    public static String getUserInput() {
        return userInput;
    }

    public static long getUserGrossIncome() {
        return userGrossIncome;
    }

    public static void getUserIncome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual income");
        userGrossIncome = Long.parseLong(scanner.nextLine());

    }

    public static void shareIncomeAfterTax() {

        System.out.println("\nAfter tax your take home pay is:" +
                "\nAnnually: " + postTaxIncome +
                "\nMonthly: " + postTaxIncome/12
        );
    }
}
