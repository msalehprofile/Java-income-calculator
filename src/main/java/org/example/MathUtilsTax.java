package org.example;

public class MathUtilsTax {
    private static double totalTaxToPay;
    private static double taxFreeIncome = 12570;

    public static double getTotalTaxToPay() {
        return totalTaxToPay;
    }

    public static void calculateIncomeTax() {
        long userGrossIncome = User.getUserGrossIncome();

        double basicTaxableAmount;
        double higherTaxableAmount;
        double basicTaxRate;
        double higherTaxRate;

        if(userGrossIncome < 12570 & userGrossIncome >0) {
            totalTaxToPay = 0;
        } else if (userGrossIncome > 12571 & userGrossIncome < 50270) {
            totalTaxToPay = (userGrossIncome - taxFreeIncome)*0.2;
            System.out.println(totalTaxToPay);
        } else if (userGrossIncome > 50271 & userGrossIncome < 100000) {
            basicTaxRate = (50270 - taxFreeIncome)*0.2;
            higherTaxRate = (userGrossIncome - 50270)*0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate;
            System.out.println(totalTaxToPay);
        } else if (userGrossIncome <= 100000) {
            basicTaxRate = (50270 - taxFreeIncome)*0.2;
            higherTaxRate = (userGrossIncome - 50270)*0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate;
            System.out.println(totalTaxToPay);
        } else if (userGrossIncome < 125141){
            basicTaxableAmount = 50270 - taxFreeIncome;
            double incomeOverOneHundredK = userGrossIncome - 100000;
            double taxFreeAmount = taxFreeIncome - (incomeOverOneHundredK)/2;
            higherTaxableAmount = userGrossIncome - basicTaxableAmount - taxFreeAmount;

            basicTaxRate = basicTaxableAmount *0.2;
            taxFreeIncome -= incomeOverOneHundredK /2;
            higherTaxRate = higherTaxableAmount *0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate;
            System.out.println("here" +totalTaxToPay);
        } else {
            basicTaxableAmount = 50270 - taxFreeIncome;
            long additionalTaxableAmount = userGrossIncome - 125140;
            higherTaxableAmount = userGrossIncome - additionalTaxableAmount - basicTaxableAmount;

            basicTaxRate = basicTaxableAmount *0.2;
            double additionalTaxRate = additionalTaxableAmount * 0.45;
            higherTaxRate = higherTaxableAmount *0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate + additionalTaxRate;

            System.out.println("here" +totalTaxToPay);
        }
    }

}
