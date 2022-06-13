package com.example.evennumberstwo;

import java.util.Scanner;

public class evenNumbersTwo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 0.");

        // get input
        int number = input.nextInt();

        // starts loop to check if input is 0
        while (number != 0)
        {
            // if input is not 0, loop asks for input until 0 is entered
            System.out.println("That is not an option. Please enter 0.");
            number = input.nextInt();

            //breaks loop once 0 is entered
            if (number == 0)
            {
                break;
            }
        }

        // If input is 0, preforms the calculation and prints result
        if (number == 0)
        {
            int newNumber = number + 20;
            System.out.println(newNumber);
            System.out.println("These are the even numbers between 20 and 40");

            while(newNumber <= 40)
            {
                System.out.print(newNumber + " ");
                newNumber += 2;
            }

        }


    }
}




