package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */


import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Solution25 {
    private static final Scanner scan = new Scanner(System.in);

    public static int passwordValidator(String pass)
    {
       int n = pass.length();
       boolean letters = false;
       boolean numbers = false;
       boolean special = false;

       char[] password = pass.toCharArray();
       for(int i=0; i<n; i++)
       {
           //If pass contains letters, letters = true
           if(Character.isLetter(password[i]))
               letters = true;
           //If pass contains numbers, numbers = true
           if(Character.isDigit(password[i]))
               numbers = true;


       }
       //regex to check for special characters
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pass);
        boolean b = m.find();

        if (b)
            special = true;

        //If statements with boolean and length to output return value
        if(letters && numbers && special && n>=8)
            return 4;
        else if(letters && numbers && n>=8)
            return 3;
        else if(letters && n<8)
            return 2;
        else if(numbers && n<8)
            return 1;
        else
            return 0;
    }

    private static void printOutput(int result, String pass)
    {
        //Printing results
        String strength = "";
        if(result == 0)
            strength = "password of unknown strength.";
        if(result == 1)
            strength = "very weak password.";
        if(result == 2)
            strength = "weak password.";
        if(result == 3)
            strength = "strong password.";
        if(result == 4)
            strength = "very strong password.";


        System.out.println("The password '"+ pass + "' is a "+ strength);

    }

    public static void main(String[] args) {
        //Takes input
        System.out.print("Please input your password: ");
        String input = scan.nextLine();

        //Calls passwordValidator function
        int result = passwordValidator(input);
        printOutput(result, input);

    }



}
