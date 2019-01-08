package javaapplication4;

import java.util.Scanner;
//By: Emil Flores / Assignment 3 / The Greatest and the Least of These 
/**
 * This program lets the user  loop that lets
 * the user enter a series of positive integers.
 * After all the numbers have been entered, the program
 * should display the largest and the smallest numbers entered.
 */
public class GreatestAndLeast {


    public static void main(String args [])
    {
        Scanner scanner = new Scanner(System.in);
        // variable to store the biggest number
        // variable to stare the smallest number
        int biggest,lowest;
        // get the first number and set it to the biggest number

        System.out.println("Please enter 10 numbers ");
        System.out.print("Please enter a number: ");
        int num = scanner.nextInt();
        biggest = num;
        lowest = num;
        for (int i = 0; i < 9; i++) {
            // get the next number
            System.out.print("Please enter a number: ");
            num = scanner.nextInt();
            // if the new number is the biggest, set it to the new biggest
            if (num > biggest && num > 0)
            {
                biggest = num;
            }
            if (num < lowest && num > 0)
            {
                lowest = num;
            }
        }

        System.out.println("The biggest number is: "+ biggest);
        System.out.println("The lowest number is: "+ lowest);
    }
}