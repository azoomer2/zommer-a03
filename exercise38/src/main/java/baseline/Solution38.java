package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution38 {
    private static final Scanner scan = new Scanner(System.in);
    private static ArrayList<Integer> evenList =  new ArrayList<>();

    public static void filterEvenNumbers(String inputIn)
    {
        //convert string into arrayList using strSplit

        String[] input = null;

        input = inputIn.split(" ");

        int size = input.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
            //if list[i]%2==0
        for(int i = 0; i<size; i++)
        {
            if(arr[i]%2==0)
            {
                evenList.add(arr[i]);
            }
        }
            //add list[i] to evens

    }


    public static void main(String[] args) {
        //take input as a string
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String userInput = scan.nextLine();

         filterEvenNumbers(userInput);
        //print evenList
        for(int i = 0; i<evenList.size(); i++)
        {
            System.out.print(evenList.get(i) + " ");
        }
    }
}
