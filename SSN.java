/**
 * Title: SSN
 * Class / Task: CPSC 1150 - Assignment 3, Exercise 2
 * Description: Prompts user to enter a social security number then checks if it is valid or not.
 * Author: Cordell Bonnieux
 * Date: June 17, 2021
 */

import java.util.Scanner;
public class SSN {
    public static void main(String[] args) {

        // create scanner object
        Scanner input = new Scanner(System.in);

        // prompt user
        System.out.print("Please enter a valid SSN (format: xxx-xxx-xxx): ");

        // read SSN
        String socialSecurity = input.nextLine();

        // check if SSN is valid
        Boolean isValid = checkSSN(socialSecurity);

        // print to console if true
        if (isValid)
            System.out.println(socialSecurity + " is a valid social security number.");
        else
            main(null);
        
    }

    public static Boolean checkSSN(String socialSecurity) {

        // check if the SSN is the correct length
        if (socialSecurity.length() != 11) {
                    
            System.out.println(socialSecurity + " is not a valid social security number.");
            return false;

        // check if first digit is less than 1
        } else if ((int)socialSecurity.charAt(0) < 49) {

            System.out.println(socialSecurity + " is not a valid social security number.");
            return false;
        
        //  checks if 4th digit is less than 1
        } else if ((int)socialSecurity.charAt(4) < 49) {
        
            System.out.println(socialSecurity + " is not a valid social security number.");
            return false;
        
        // check if dashes are in the correct positions
        } else if ((char)socialSecurity.charAt(3) != '-' || (char)socialSecurity.charAt(7) != '-') {
        
            System.out.println(socialSecurity + " is not a valid social security number.");
            return false;

        // check to see if the rest of the characters are digits
        } else {
        
            for (int i = 0; i < 10; i++) {
        
                if (i != 3 && i != 7) {
        
                    if ((int)socialSecurity.charAt(i) > 57 || (int)socialSecurity.charAt(i) < 48) {

                        System.out.println(socialSecurity + " is not a valid social security number.");
                        return false;

                    }
        
                }
        
            }
        
        }

        return true;

    }
}