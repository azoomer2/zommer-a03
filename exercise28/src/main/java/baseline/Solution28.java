package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */
import java.util.Scanner;

public class Solution28 {

    private static final Scanner scan = new Scanner(System.in);

    public static int takeInput()
    {
        System.out.print("Enter a number: ");
        String inputString = scan.nextLine();
        return (Integer.parseInt(inputString));
    }

    public static void main(String[] args) {


        int sum = 0;
        //loop to take input and then add to sum
        for(int i=0; i<5; i++)
        {
            int userInput = takeInput();
            sum = sum + userInput;
        }


        System.out.println("The total is " + sum + ".");
    }
}
