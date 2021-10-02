package baseline;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27 {

    private static final Scanner scan = new Scanner(System.in);

    private static String firstName;
    private static String lastName;
    private static int zipCode;
    private static String employeeID;
    private static String errors = "";
    private static boolean e = false;

    public static void getFirstName()
    {
        //Take firstName input
        System.out.print("Enter the first name: ");
        firstName = scan.nextLine();

        //Check for valid input

        //More than 2 characters
        if(firstName.length() < 3) {
            errors = errors + "The first name must be at least 2 characters long. \n";
            e = true;
        }

        //Must be filled in
        if(firstName.equals("")){
            errors = errors + "The first name must be filled in. \n";
            e = true;
        }
    }

    public static void getLastName()
    {
        //Take lastName input
        System.out.print("Enter the last name: ");
        lastName = scan.nextLine();
        //Check for valid input

        //More than 2 characters
        if(lastName.length() < 3) {
            errors = errors + "The last name must be at least 2 characters long. \n";
            e = true;
        }

        //Must be filled in
        if(lastName.equals("")){
            errors = errors + "The last name must be filled in. \n";
            e = true;
        }

    }
    public static void getZipCode()
    {
        //Take zipCode input
        try{
            System.out.print("Enter the ZIP code: ");
            String zipInput = scan.nextLine();
            zipCode = Integer.parseInt(zipInput);
            //Check for valid input
            //Must be numbers
            if(zipInput.length() != 5) {
                errors = errors + "The zipcode must be a 5 digit number. \n";
                e = true;
            }

        }catch (Exception numFail){
            errors = errors + "The zipcode must be all numbers. \n";
            e = true;
        }

    }
    public static void getEmployeeID()
    {
        //Take lastName input
        System.out.print("Enter the employee ID: ");
        employeeID = scan.nextLine();
        //Check for valid input
        //Must follow format two letters - four numbers
        String key = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if(!Pattern.matches(key,employeeID)){
            errors = errors + "The employee ID must be in the format of AA-1234";
            e = true;
        }

    }
    public static void errorCheck()
    {
        if(!e)
            errors = "There were no errors found.";
    }

    public static void main(String[] args) {
        //Call get functions in order
        getFirstName();
        getLastName();
        getZipCode();
        getEmployeeID();

        errorCheck();
        System.out.print(errors);
    }
}
