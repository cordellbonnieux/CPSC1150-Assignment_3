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

        // create array to store prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

        // populate primeNumbers with all prime numbers between 0 and 99999
        for (int i = 0; i < 99999; i++) {

            Boolean prime = isPrime(i);
            if (prime) primeNumbers.add(i);

        }

        // create array to store palindrome primes
        ArrayList<Integer> palindromePrimes = new ArrayList<Integer>();

        // find all the palindromes in primeNumbers and add them to palindomePrimes
        for (int y = 0; y < primeNumbers.size(); y++) {

            Boolean palindrome = isPalindrome(primeNumbers.get(y));
            if (palindrome) palindromePrimes.add(primeNumbers.get(y));

        }

        // for now, print all the palindrome primes
        for (int w = 0; w < palindromePrimes.size(); w++) {
            System.out.print(", " + palindromePrimes.get(w));
        }


    }

    // this method determines whether or not a number is prime
    public static Boolean isPrime(int i) {

        // 0 and 1 are not prime numbers
        if (i == 0 || i == 1) {

            return false;
                
        } else {

            for (int x = 2; x <= (i/2); x++) {

                // if i divided by 2 to half of i has no remainder
                if (i % x == 0)

                    // i is not prime
                    return false;

            }

            // if it cannot divide evenly, it is prime
            return true;
        }
    }

    // this method determines whether or not a number is a palindrome
    public static Boolean isPalindrome(int num) {

        // if num is a single digit, it is by definition a palindrome
        if (num < 10) return true;

        // create a string with the value of num
        String number = String.valueOf(num);

        // get the length of the string version of the number
        int length = number.length();

        // get half the length of the string version of the number
        int half = length / 2;

        // compare the first to last, second to second to last etc digits in each number
        for (int z = 0; z < half; z++) {

            // if the digits do not match, it is not a palindrome
            if (!(number.charAt(z) == number.charAt((length - 1) - z)))
                return false;

        }

        // otherwise, it is
        return true;
    }
}
