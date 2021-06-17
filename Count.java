
import java.util.Scanner;
public class Count {
    public static void main(String[] args) {

        //
        Scanner input = new Scanner(System.in);

        //
        System.out.print("Enter a string: ");

        //
        String userString = input.nextLine();

        // variables to count the number of each character type
        int digitCounter = 0, uppercaseCounter = 0;

        // print the string trimmed
        //System.out.println(userString.trim());

        // check each character in the string
        for (int i = 0; i < userString.length(); i++) {
            // System.out.println((int)userString.charAt(i));

            // check for uppercase letter
            if (((int)userString.charAt(i)) >= 65 && ((int)userString.charAt(i)) < 91) 
                uppercaseCounter++;
            
            // check for numbers
            else if (((int)userString.charAt(i)) < 58 && ((int)userString.charAt(i)) >= 48)
                digitCounter++;
        }

    }
}