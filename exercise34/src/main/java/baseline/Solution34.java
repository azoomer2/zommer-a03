package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution34 {
    private static final Scanner scan = new Scanner(System.in);

    private static ArrayList<String> employee = new ArrayList<String>();

    private static void deleteEmployee(String userToDelete)
    {
        //employee.remove(userToDelete)
        employee.remove(userToDelete);
    }



    public static void main(String[] args) {
        //Add 5 names to employee
        employee.add("John Smith");
        employee.add("Jackie Jackson");
        employee.add("Chris Jones");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");

        //prompt user for name to remove
        System.out.print("Enter and employee name to remove: ");
        String userInput = scan.nextLine();

        deleteEmployee(userInput);
        //for loop to print remaining employees
        for(int i=0; i<employee.size();i++)
            System.out.print(employee.get(i)+"\n");

    }
}
