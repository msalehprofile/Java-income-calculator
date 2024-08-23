package org.example;

public class MathsUtilsNI {
    private static double totalNIToPay;

    public static double getTotalNIToPay() {
        return totalNIToPay;
    }

    public static void calculateNIToPay() {
        double userGrossIncome = User.getUserGrossIncome();

        if( userGrossIncome/52 <= 242) {
            totalNIToPay = 0;
        } else if (userGrossIncome/52 <= 967) {
            double lowerNIBracket = (userGrossIncome/52) - 242;
            System.out.println("lower bracket " + lowerNIBracket);
            totalNIToPay = (lowerNIBracket * 0.08)*52;
            System.out.println("ni " + totalNIToPay);
        } else {
            double lowerNIToPay = 725 * 0.08;
            double higherNIBracket = ((userGrossIncome/52) - 967)*0.02;
            totalNIToPay = (lowerNIToPay + higherNIBracket)*52;
            System.out.println("ni " + totalNIToPay);
        }


    }

}
