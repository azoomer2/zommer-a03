package baseline;

import java.util.Scanner;

public class Solution32 {

    private static final Scanner scan = new Scanner(System.in);


    private static int chooseDifficulty()
    {
        //Take input from user for difficulty level


        //return value
    }

    private static boolean inputValidation(String userInput)
    {
        boolean flag = false;

        try{
            //if non int
        }catch{
            //Set flag to true
        }
        return flag;
    }

    private static void numberGame(int difficulty)
    {
        int target;
        int guess;
        int index=0;
        //Take difficulty in
        //if difficulty 1
            //target = rand between 1 and 10
        //if difficulty 2
            //target = rand between 1 and 100
        //if difficulty 3
            //target = rand between 1 and 1000

        //Take user input for guess
        //inputValidation(input)
        //while(guess != target)
            //if guess < target
                //too low message
            //else if guess > target
                //too high message
            //else
                //print you got it in index guesses!
            //index++;


    }


    public static void main(String[] args) {

        int difficulty = chooseDifficulty();
        numberGame(difficulty);


    }
}
