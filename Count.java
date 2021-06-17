/**
 * Title: Count
 * Class / Task: CPSC 1150 - Assignment 3, Exercise 1
 * Description: This program reads a string, then returns the number of digits and uppercase letters in that string.
 * Author: Cordell Bonnieux
 * Date: June 17, 2021
 */

import java.util.Scanner;
public class Count {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user to input string
        System.out.print("Enter a string: ");

        // read string from user
        String userString = input.nextLine();

        // variables to count the number of each character type
        int digitCounter = 0, uppercaseCounter = 0;

        // check each character in the string
        for (int i = 0; i < userString.length(); i++) {

            // check for uppercase letter
            if (((int)userString.charAt(i)) >= 65 && ((int)userString.charAt(i)) < 91) 
                uppercaseCounter++;
            
            // check for numbers
            else if (((int)userString.charAt(i)) < 58 && ((int)userString.charAt(i)) >= 48)
                digitCounter++;
        }

        // print the number of uppercase letters
        System.out.println("The number of uppercase letters is " + uppercaseCounter);

        // print the number of digits 
        System.out.println("The number of digits is " + digitCounter);

    }
}