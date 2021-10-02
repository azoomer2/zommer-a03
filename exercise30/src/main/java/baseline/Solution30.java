package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Alexander Zommer
 */
public class Solution30 {

    public static void tableGenerator()
    {
        //for loop 1-12
        for(int i=1; i<=12; i++){
            //insert new line to skip down a row
            if(i>1)
                System.out.println("\n");

            //for loop 1-12
            for(int j=1; j<=12; j++){
                //print i*j
                System.out.printf("%4d",(i*j));
            }
        }
    }




    public static void main(String[] args) {
        //call tableGenerator()
        tableGenerator();
    }

}
