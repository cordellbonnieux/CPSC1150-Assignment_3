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
        
    }

    public static Boolean checkSSN(String socialSecurity) {

                // check if first digit is 0
                if (((int)socialSecurity.charAt(0)) == 0) {

                    System.out.println("invalid format - 1st check");
                    main(null);
        
                //  checks if 4th digit is less than 1
                } else if (((int)socialSecurity.charAt(4)) < 1) {
        
                    System.out.println("invalid format - 2nd check");
                    main(null);
        
                // check if dashes are formated is correctly
                } else if (((char)socialSecurity.charAt(3)) != '-' || ((char)socialSecurity.charAt(7)) != '-') {
        
                    System.out.println("invalid format - 2nd check");
                    main(null);
        
                // check if the rest of the characters are digits
                } else {
        
                    for (int i = 0; i < 10; i++) {
        
                        if (((int)socialSecurity.charAt(i)) != 3 || ((int)socialSecurity.charAt(i)) != 7) {
        
                            System.out.println("social security at index " + i + " equals " + ((int)socialSecurity.charAt(i)));
        
                        }
        
                    }
        
                }

                return true;
    }
}