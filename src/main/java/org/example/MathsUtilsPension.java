package org.example;

public class MathsUtilsPension {
    private static double totalPensionToPay;

    public static double getTotalPensionToPay() {
        return totalPensionToPay;
    }

    public static void calculationPensionToPay( ) {
        long userGrossIncome = User.getUserGrossIncome();
        long userPensionContribution =  User.getUserPensionContribution();

        totalPensionToPay = userGrossIncome * ((double) userPensionContribution /100);
        System.out.println(totalPensionToPay);
    }
}
