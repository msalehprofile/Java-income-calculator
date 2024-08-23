package org.example;

import java.util.Scanner;

public class User {
    private static String userInput;
    private static long userGrossIncome;
    private static double postTaxIncome;
    private static long userPensionContribution;
    private static double pensionSpend;
    private static double NISpend;
    private static double taxSpend;


    public static String getUserInput() {
        return userInput;
    }

    public static long getUserPensionContribution() {
        return userPensionContribution;
    }

    public static long getUserGrossIncome() {
        return userGrossIncome;
    }

    public static void getUserIncome() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your annual income");
        userGrossIncome = Long.parseLong(scanner.nextLine());
    }

    public static void getUserPension() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the percentage of your pension contribution:");
        userPensionContribution = Long.parseLong(scanner.nextLine());
    }

    public static void shareIncomeAfterTax() {
        pensionSpend = MathsUtilsPension.getTotalPensionToPay();
        NISpend = MathsUtilsNI.getTotalNIToPay();
        System.out.println(NISpend + "ni spend");
        taxSpend = MathUtilsTax.getTotalTaxToPay();
        System.out.println(NISpend + taxSpend + "spends");
        postTaxIncome = userGrossIncome - pensionSpend - NISpend - taxSpend;

        System.out.println("\nYour net take home pay is:" +
                "\nAnnually: £" + postTaxIncome +
                "\nMonthly: £" + postTaxIncome/12 +
                "\n" +
                "\nYou will pay the below values annually:" +
                "\nTax: £" + taxSpend +
                "\nNational Insurance: £" + NISpend +
                "\nPension: £" + pensionSpend
        );
    }
}
