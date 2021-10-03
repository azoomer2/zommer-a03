package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;


public class Solution31 {

    private static final Scanner scan = new Scanner(System.in);


    private static int pulse;
    private static int age;


    private static void takeInput()
    {
        boolean pulseE = true;
        boolean ageE = true;

        do {
            try {
                //Take user input resting pulse
                //Validate it's not 0, and it is ints
                System.out.print("Resting pulse: ");
                String pulseIn = scan.nextLine();
                pulse = Integer.parseInt(pulseIn);
                pulseE = true;
            }catch (Exception pulseInvalidInput){
                System.out.println("Invalid Input, please try again!");
                pulseE=false;
            }
            if(pulseE && pulse == 0){
                System.out.println("Invalid Input, please try again!");
                pulseE=false;
            }

        }while(!pulseE);

        do {
            try {
                //Take user input for age
                //Validate it's not 0, and it is ints
                System.out.print("Age: ");
                String ageIn = scan.nextLine();
                age = Integer.parseInt(ageIn);
                ageE = true;
            }catch (Exception ageInvalidInput){
                System.out.println("Invalid Input, please try again!");
                ageE=false;
            }
            if(ageE && age == 0){
                System.out.println("Invalid Input, please try again!");
                ageE=false;
            }
        }while(!ageE);

    }

    public static long calcRate(int intensityUnrounded, int age, double restingPulse)
    {
        double intensity = intensityUnrounded/100.0;

        double rateUnrounded = ((((220 - age) - restingPulse) * intensity) + restingPulse);
        return(Math.round(rateUnrounded));

    }

    private static void  printTable(int intensity, long rate)
    {
        //create table using calcRate result

        System.out.printf("%d%%        | %d bpm %n",intensity, rate);
    }
    public static void main(String[] args) {

        takeInput();

        System.out.printf("Intensity  | Rate  %n");
        System.out.print("------------------\n");
        for(int intensity = 55;intensity<=95;intensity+=5){
            long rate = calcRate(intensity,age,pulse);
            printTable(intensity,rate);
        }


    }
}
