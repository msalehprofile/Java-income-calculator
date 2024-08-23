package org.example;

public class IncomeCalculator {
    private static long userIncome;

    public static void calculateTakeHomePay() {
        User.getUserIncome();
        User.getUserPension();
        MathUtilsTax.calculateIncomeTax();

        MathsUtilsNI.calculateNIToPay();
        MathsUtilsPension.calculationPensionToPay();
        User.shareIncomeAfterTax();
    }


}
