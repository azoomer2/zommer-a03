package baseline;

import java.util.Scanner;

public class Solution29 {

    private static final Scanner scan = new Scanner(System.in);
    private static int check = 0;

    public static boolean inputValidation(String input) {

        try {


        check = Integer.parseInt(input);
        //return true if failed validation
        }catch (Exception numFail){
            return true;
        }

        if(check == 0)
            return true;
        //return false if passed validation
        return false;
    }

    public static int doubleInvestment(int r)
    {
        return (72/r);
    }

    public static void main(String[] args) {

        String input;

        boolean error = true;

        while(error) {
            //take input
            System.out.print("What is the rate of return? ");
            input = scan.nextLine();

            //validate input
            error = inputValidation(input);
            //if failed, print message
            if (error)
                System.out.print("Sorry that's not a valid input.\n");
        }
        //else
            int years = doubleInvestment(check);

        System.out.print("It will take " + years + " years to double your initial investment.");

    }
}
