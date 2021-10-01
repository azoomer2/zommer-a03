package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

        static String input1;
        static String input2;
        private static final Scanner scan = new Scanner(System.in);

        public static boolean isAnagram(String input1, String input2)
        {
                //Take inputs A and B,
                //Check if lengths match, if not return false
                if(input1.length() != input2.length())
                        return false;
                //convert to char arrays, sort, return true if they equal each other
                char[] a1 = input1.toCharArray();
                char[] a2 = input2.toCharArray();
                Arrays.sort(a1);
                Arrays.sort(a2);
                if (Arrays.equals(a1,a2))
                        return true;
                else
                        return false;
        }
        public static void takeInput()
        {
                //Takes user input and sets to string variables input1, input 2
                System.out.println("Enter two strings and I'll tell you if they are anagrams:");
                System.out.print("Enter the first string: ");
                input1 = scan.nextLine();
                System.out.print("Enter the second string: ");
                input2 = scan.nextLine();
        }
        public static void printResult(boolean res)
        {
                //Prints the result to the user
                if(res)
                        System.out.println("\"" + input1 + "\""+ " and "+ "\"" + input2 + "\" are anagrams." );
                else
                        System.out.println("\"" + input1 + "\""+ " and "+ "\"" + input2 + "\" are not anagrams." );
        }

        public static void main(String[] args) {
                //Call functions in proper order
                boolean result = false;
                takeInput();
                result = isAnagram(input1, input2);
                printResult(result);


        }
}
