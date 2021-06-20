/**
 * Title: Palindrome Prime
 * Class / Task: CPSC 1150 - Assignment 3, Exercise 3
 * Description: 
 * Author: Cordell Bonnieux
 * Date: June 17, 2021
 */
import java.util.ArrayList;
public class PalindromePrime {
    public static void main(String[] args) {

        // create array of primes
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        for (int i = 0; i < 99999; i++) {
            Boolean prime = isPrime(i);
            if (prime) primeNumbers.add(i);

        }


    }
    public static Boolean isPrime(int i) {

        if (i == 0 || i == 1) {

            return false;
                
        } else {

            for (int x = 2; x <= (i/2); x++) {
                
                if (i % x == 0) {

                    return false;

                } else {

                    return true;

                }
            }
        }
    }
    public static Boolean isPalindrome(int num) {

    }
}
