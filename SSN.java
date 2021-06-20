/**
 * Title: Count
 * Class / Task: CPSC 1150 - Assignment 3, Exercise 2
 * Description:
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
            System.out.println(socialSecurity + " is valid.");
        else
            main(null);
        
    }

    public static Boolean checkSSN(String socialSecurity) {

                // check if first digit is 0
                if (((int)socialSecurity.charAt(0)) < 49) {

                    System.out.println("invalid format - first digit is less than 1");
                    socialSecurity = "";
                    return false;
        
                //  checks if 4th digit is less than 1
                } else if (((int)socialSecurity.charAt(4)) < 49) {
        
                    System.out.println("invalid format - the fourth digit is less than 1");
                    socialSecurity = "";
                    return false;
        
                // check if dashes are formated is correctly
                } else if (((char)socialSecurity.charAt(3)) != '-' || ((char)socialSecurity.charAt(7)) != '-') {
        
                    System.out.println("invalid format - missing a - symbol");
                    socialSecurity = "";
                    return false;
        
                // check if the rest of the characters are digits
                } else {
        
                    for (int i = 0; i < 10; i++) {
        
                        if (i != 3 && i != 7) {
        
                            System.out.println("social security at index " + i + " equals " + ((int)socialSecurity.charAt(i)));
        
                        }
        
                    }
        
                }

                return true;
    }
}