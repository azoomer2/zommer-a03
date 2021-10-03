package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution33 {

    private static final Scanner scan = new Scanner(System.in);

    public static int numGenerator()
    {
        //generate random number between 0 and 4
        return((int) (Math.random()*(3))+1);
    }



    private static void eightBall(int num) {
        //create arrayList for 4 options
        //print option of randNum
        ArrayList<String> answers = new ArrayList<String>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later.");

        System.out.println(answers.get(num));

    }


    public static void main(String[] args) {

        //Take prompt for user question
        System.out.println("What's your question?");
        String question = scan.nextLine();
        //call numGen and eightball
        int num = numGenerator();
        eightBall(num);

    }


}
