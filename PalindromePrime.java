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

        return false;
    }
    public static Boolean isPalindrome(int num) {

        String number = String.valueOf(num);

        int length = number.length();

        int half = length / 2;

        for (int z = 0; z < half; z++) {

            if (!(number.charAt(z) == number.charAt((length - 1) - z)))
                return false;

        }

        return true;
    }
}
