package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Solution37 {
    private static final Scanner scan = new Scanner(System.in);
    private static int n;
    private static int c;
    private static int nums;
    private static final ArrayList<Character> password = new ArrayList<>();

    public static char randomSpecial()
    {
        //make list of special chars
        ArrayList<Character> randSpec = new ArrayList<>(Arrays.asList('<','>','/','?','!','(',')','%','&','$'));
        int index = (int)(Math.random()*11)-1;
        //generate random num
        //return random selected special char
        return randSpec.get(index);
    }

    public static char randomNum()
    {
        //make list of special chars
        ArrayList<Character> randNum = new ArrayList<>(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
        int index = (int)(Math.random()*11)-1;
        //generate random num
        //return random selected special char
        return randNum.get(index);
    }

    public static char randomLetter()
    {
        ArrayList<Character> randLetter = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o',
                'p','q','r','s','t','u','v','x','y','z'));
        int index = (int)(Math.random()*26)-1;
        //generate random num
        //return random selected special char
        return randLetter.get(index);
    }

    private static void takeInput()
    {
        boolean flag = false;
        do{
            //Take input for length
            System.out.print("What's the minimum length? ");
            String lengthIn = scan.nextLine();
            n = Integer.parseInt(lengthIn);
            //Take input for special chars
            System.out.print("How many special characters? ");
            String charsIn = scan.nextLine();
            c = Integer.parseInt(charsIn);
            //Take input for numbers
            System.out.print("How many numbers? ");
            String numsIn = scan.nextLine();
            nums = Integer.parseInt(numsIn);

            if((c+nums) > (n-(c+nums)))
            {
                flag = true;
                System.out.println("Please make sure that there are as many letters as numbers and special characters.");
            }
        }while(flag);

    }

    public static void main(String[] args) {
        takeInput();
        //Call chars function
        for(int i=0; i<c;i++)
            password.add(randomSpecial());
        //Call num function
        for(int i=0; i<nums;i++)
            password.add(randomNum());
        //Call letters function for remaining
        for(int i=0; i<(n-(nums+c));i++)
        {
            password.add(randomLetter());
        }

        Collections.shuffle(password);
        for (Character character : password) {
            System.out.print(character);
        }



        //use .shuffle to randomly mix array into pass
    }
}
