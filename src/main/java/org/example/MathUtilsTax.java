package org.example;

public class MathUtilsTax {
    private static long userGrossIncome;
    private static double userIncomeAfterTax;
    private static double totalTaxToPay;
    private static double basicTaxRate;
    private static double higherTaxRate;
    private static double additionalTaxRate;
    private static double incomeOverOneHundredK;
    private static double taxFreeIncome = 12570;
    private static double higherTaxableAmount;
    private static double basicTaxableAmount;

    public static double getUserIncomeAfterTax() {
        return userIncomeAfterTax;
    }

    public static void calculateIncomeTax() {
        userGrossIncome = User.getUserGrossIncome();

        if(userGrossIncome < 12570 & userGrossIncome >0) {
            userIncomeAfterTax = userGrossIncome;
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
            totalTaxToPay = basicTaxRate + higherTaxRate ;
            System.out.println(totalTaxToPay);
        } else if (userGrossIncome < 125141){
            basicTaxableAmount = 50270 - taxFreeIncome;
            incomeOverOneHundredK = userGrossIncome - 100000;
            double taxFreeAmount = taxFreeIncome - (incomeOverOneHundredK)/2;
            higherTaxableAmount = userGrossIncome - basicTaxableAmount - taxFreeAmount;

            basicTaxRate = basicTaxableAmount*0.2;
            taxFreeIncome -= incomeOverOneHundredK/2;
            higherTaxRate = higherTaxableAmount*0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate;
            System.out.println("here" +totalTaxToPay);
        } else {
            basicTaxableAmount = 50270 - taxFreeIncome;
            long additionalTaxableAmount = userGrossIncome - 125140;
            higherTaxableAmount = userGrossIncome - additionalTaxableAmount - basicTaxableAmount;

            basicTaxRate = basicTaxableAmount*0.2;
            additionalTaxRate = additionalTaxableAmount*0.45;
            higherTaxRate = higherTaxableAmount*0.4;
            totalTaxToPay = basicTaxRate + higherTaxRate + additionalTaxRate;

            System.out.println("here" +totalTaxToPay);
        }
    }

}
