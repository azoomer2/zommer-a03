package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */
import java.util.Scanner;

public class Solution32 {

    private static final Scanner scan = new Scanner(System.in);
    private static int index = 0;
    private static int target;
    private static int guess;


    private static int chooseDifficulty()
    {
        boolean invalid = true;
        String userInput = null;
        int diff=0;
        //Take input from user for difficulty level
        do {
            try {
                    System.out.print("Enter the difficulty level (1,2 or 3): ");
                    userInput = scan.nextLine();
                    diff = Integer.parseInt(userInput);
                    invalid = false;

                    if(diff < 0 || diff > 3){
                        System.out.print("Invalid input. Please try again.\n");
                        invalid = true;
                    }
            } catch (Exception invalidInt) {
                System.out.print("Invalid input. Please try again.\n");
                invalid = true;
            }
        }while(invalid);

        return diff;
        //return value
    }

    private static int firstInput()
    {
        int guess = 0;
        boolean flag = true;

        do {
            System.out.print("I have my number. What's your guess? ");
            String guessIn = scan.nextLine();
            index++;

            try {
                guess = Integer.parseInt(guessIn);
                flag = false;

            } catch (Exception invalidInt) {
                System.out.print("Invalid input. Please try again.\n");
                flag = true;
            }
        }while(flag);

        return guess;
    }

    private static int inputValidation()
    {
        int guess = 0;
        boolean flag = true;

        do {
            String guessIn = scan.nextLine();
            index++;

            try {
                guess = Integer.parseInt(guessIn);
                flag = false;

            } catch (Exception invalidInt) {
                System.out.print("Invalid input. Please try again.\n");
                flag = true;
            }
        }while(flag);

        return guess;
    }
    private static void guessEvaluation()
    {
        //while(guess != target)
        do
        {
            //if guess < target
            if(guess < target)
            {
                System.out.print("Too low. Guess again: ");
                guess = inputValidation();
            }
            //too low message
            //else if guess > target
            else if(guess > target)
            {
                System.out.print("Too high. Guess again: ");
                guess = inputValidation();
            }
            //too high message

            //print you got it in index guesses!
            //index++;
        }while(guess != target);



    }


    private static void numberGame(int difficulty)
    {


        //Take difficulty in
        //if difficulty 1
        if(difficulty == 1)
        {
            //target = rand between 1 and 10
            target = (int) (Math.random()*(9))+1;
            System.out.println(target);

        }

        //if difficulty 2
        if(difficulty == 2)
        {
            //target = rand between 1 and 100
            target = (int) (Math.random()*(99)+1);
        }

        //if difficulty 3
        if(difficulty == 3)
        {
            //target = rand between 1 and 1000
            target = (int) (Math.random()*(999)+1);
        }


        //Take user input for guess
        //inputValidation(input)
        firstInput();
        guessEvaluation();
        System.out.println("You got it in "+ index + " guesses!");

    }


    public static void main(String[] args) {

        boolean tryAgain=false;

        do {
            int difficulty = chooseDifficulty();
            numberGame(difficulty);
            System.out.print("Do you wish to play again (Y/N)?");
            String again = scan.nextLine();
            if(again.matches("y"))
                tryAgain = true;

        }while(tryAgain);

    }
}
