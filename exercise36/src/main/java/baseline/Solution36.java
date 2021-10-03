package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Solution36 {
    private static final Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> times = new ArrayList<Integer>();

    public static double average(ArrayList times)
    {
        int total=0;


        //for loop for size of times
        for(int i=0; i<times.size(); i++)
        {
            //total = loop through list and add all indices
            total = total + (int)times.get(i);
        }
        return((double)total/times.size());
    }
    public static double max(ArrayList times)
    {

        int max = (int)times.get(0);
        //for loop for size of times
        for(int i=0; i<times.size(); i++)
        {
            if((int)times.get(i) > max)
            {
                //if times[i] > max
                max = (int)times.get(i);
                //set max to times[i]
            }
        }
        return max;
    }


    public static double min(ArrayList times)
    {
        int min = (int)times.get(0);
        //for loop for size of times
        for(int i=0; i<times.size(); i++)
        {
            if((int)times.get(i) < min)
            {
                //if times[i] < min
                min = (int)times.get(i);
                //set min to times[i]
            }
        }
        return min;
    }
    public static double std(ArrayList times, double average)
    {
        double sum = 0;
        //sd = sqrt(sumof(x-avg)^2)/times.length()))
        for(int i = 0; i < times.size(); i++)
        {
            sum = sum+ Math.pow(((int)times.get(i)-average),2);
        }

        return(Math.sqrt((sum/times.size())));
    }

    private static void takeInput()
    {
        //take input from user
        boolean flag = true;
        boolean exit = false;
        int time = 0;
        do {
            do {
                System.out.print("Enter a number: ");
                String input = scan.nextLine();

                try {

                    if (input.equals("done")){
                        exit = true;
                        break;
                    }
                    else{
                        time = Integer.parseInt(input);
                        flag = false;
                    }

                } catch (Exception invalidInt) {
                    System.out.print("Invalid input. Please try again.\n");
                    flag = true;
                }
            } while (flag);
            if(!exit)
                times.add(time);

        }while(!exit);
        //add input to times until input = done
    }


    public static void main(String[] args) {

        takeInput();
        System.out.print("The average is "+ average(times)+".\n");
        System.out.print("The minimum is " + (int)min(times) +".\n");
        System.out.print("The maximum is " + (int)max(times) +".\n");
        System.out.printf("The standard deviation is %.2f.",std(times,average(times)));

    }
}
