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


        // check if first digit is 0
        if (((int)socialSecurity.charAt(0)) == 0) {

            System.out.println("invalid format - 1st check");
            main(args);

        //  checks if 4th digit is less than 1
        } else if (((int)socialSecurity.charAt(4)) < 1) {

            System.out.println("invalid format - 2nd check");
            main(args);

        // check if dashes are formated is correctly
        } else if (socialSecurity.charAt(3) != "-" || socialSecurity.charAt(7) != "-") {

            System.out.println("invalid format - 2nd check");
            main(args);

        // check if 
        }

        
    }
}