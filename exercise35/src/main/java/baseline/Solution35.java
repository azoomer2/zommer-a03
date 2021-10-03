package baseline;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution35 {

    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<String> lottery = new ArrayList<String>();

    private static void listManager() {

        String nameInput = "init";
        //Prompt user to enter a name
        while (!nameInput.equals("")) {
            System.out.print("Enter a name: ");
            //Take user input for name
            nameInput = scan.nextLine();
            if(!nameInput.equals(""))
                lottery.add(nameInput);
            //loop until user inputs ""
        }
    }

    private static void nameChoice()
    {
        //generate selectionIndex
        int choice = (int)(Math.random()*(lottery.size())+1);
        System.out.println("The winner is.... "+lottery.get(choice));
        //rand num between 0 and lottery.length()
        //print out winning name
    }


    public static void main(String[] args) {

        listManager();
        nameChoice();

    }
}
