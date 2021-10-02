package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */
import java.util.Scanner;

public class Solution26 {
    private static final Scanner scan = new Scanner(System.in);
    static double b = 0.0;
    static double i = 0.0;
    static double p = 0.0;

    public static double aprPercentToDailyRate(double percent)
    {
        return((percent/100)/365);
    }

    public static void main(String[] args) {
        //Take input for number of months
        System.out.print("What is your balance?");
        String bInput = scan.nextLine();
        b = Double.parseDouble(bInput);

        //Take input for APR as percent
        System.out.print("What is the APR on the card (as a percent)?");
        String aprInput = scan.nextLine();
        double aprPercent = Double.parseDouble(aprInput);

        i = aprPercentToDailyRate(aprPercent);

        //Take input for balance
        System.out.print("What is the monthly payment you can make?");
        String pInput = scan.nextLine();
        p = Double.parseDouble(pInput);

        double n = PaymentCalculator.calculateMonthsUntilPaidOff();

        //Print out monthly payment
        System.out.println("It will take you "+n+" months to pay off this card.");
    }



}
