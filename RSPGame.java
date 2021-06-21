/**
* Title: Rock, Scissors, Paper (aka Rock, Paper, Scissors)
* Description: Classic game of Rock, Paper, Scissors with five rounds.
* Author: Cordell Bonnieux
* Date: 31/05/2021
* Class: CPSC 1150
* Assignment: Lab4
**/
import java.util.Scanner;
public class RSPGame {
    public static void main(String[] args){

        // create scanner object
        Scanner input = new Scanner(System.in);

        // round counter
        int round = 1;

        // two ints to keep score
        int playerScore = 0;
        int compScore = 0;


        // play five rounds
        while (round <= 5) {
            // 1. prompt user to enter an integer (0, 1 or 2)
            // 2. read int, and check if valid
            // 3. if it's valid it is store in 'user' - if not, the method restarts
            int user = userPlay(input, round);

            // computer generates an integer; either 0, 1 or 2
            int computer = 0 + (int) (Math.random() * 3);

            // display the plays in the comsole
            System.out.println("Computer played: " + playName(computer));
            System.out.println("You played: " + playName(user));

            // check who wins based on the given plays. Then update the score
            switch(checkWinner(user, computer, playerScore, compScore, round)) {
                case 1:
                    playerScore++;
                    break;
                case 0:
                    compScore++;
                    break;
                case 2: 
                    break;
            }

            // increment the round
            round++;
        }

        // check the total scores and display the winner
        //System.out.printf("Match Summary:");
        System.out.printf("Your wins: %d \n", playerScore);
        System.out.printf("Computer wins: %d \n", compScore);

        // who ever has the most total points wins, unless it is a tie
        if (playerScore > compScore) {

            System.out.println("It looks like you won!");

        } else if (compScore > playerScore) {

            System.out.println("Computer wins! Which means, you loose!");

        } else {

            System.out.println("Crazy! It's a tie!");
        }

    }

    public static int checkWinner(int user, int computer, int playerScore, int compScore, int round) {

        // check to see who won and print the appropriate message
        if ((user == 0 && computer == 1) || (user == 1 && computer == 2) || (user == 2 && computer == 0)){

            System.out.println("Round " + round + ": You win!");
            return 1;

        } else if ((computer == 0 && user == 1) || (computer == 1 && user == 2) || (computer == 2 && user == 0)) {

            System.out.println("Round " + round + ": Computer wins!");
            return 0;

        } else {

            System.out.println("Round " + round +": It's a draw!");
            return 2;

        }
    }
    
    public static int userPlay(Scanner input, int round) {

        // prompt the user to enter 0, 1 or 2
        System.out.print("Round " + round + ": Select: rock (0), scissors (1), or paper (2)");

        // read int from user
        int num = input.nextInt();

        if (num > 2 || num < 0)

            // if user input is not valid restart method
            return userPlay(input, round);

        else

            // if user input is valid, return it
            return num;

    }

    public static String playName(int play) {
        
        // return the name of the play (i.e. rock, paper or scissors)
        if (play == 0)
            return "rock";
        else if (play == 1)
            return "scissors";
        else 
            return "paper";

    }
}