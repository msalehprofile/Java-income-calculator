package org.example;

public class IncomeCalculator {
    private static long userIncome;

    public static void calculateTakeHomePay() {
        User.getUserIncome();
        MathUtilsTax.calculateIncomeTax();
        User.shareIncomeAfterTax();
        MathsUtilsNI.calculateNIToPay();
    }


}
