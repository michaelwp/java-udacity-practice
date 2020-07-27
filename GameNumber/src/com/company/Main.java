/**
 * created by MichaelWP, 27072020
 * Part of Udacity Java OOP course
 */

package com.company;

// import the scanner library
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // random number 1 - 100
        int randomNumber = (int) (Math.random() * 100) + 1;

        // description what to do
        System.out.println("Please guess number between 1 - 100");

        // set default won status
        boolean hasWon = false;

        // define scanner
        Scanner scanner = new Scanner(System.in);

        // looping the guess(es) 10 - 1
        for (int i=10; i > 0; i--) {
            // description the guess(es) number left.
            System.out.println("You have " + i + " guess(es) left. Guess again:");

            // get the guess number
            int guess = scanner.nextInt();

            // condition
            if (randomNumber > guess) {
                // if random number greater than the guess number
                System.out.println("It's larger than " + guess + ".");
            } else if (randomNumber < guess) {
                // if random number greater less the guess number
                System.out.println("It's smaller than " + guess + ".");
            } else {
                // if random number equal the guess number (correct guessing)
                hasWon = true;
                break;
            }
        }

        // condition if win or lose
        if (hasWon) {
            // if win
            System.out.println("Correct.., you win !!");
        } else {
            // if lose
            System.out.println("Game over.., you lose !!");
            System.out.println("The number is, " + randomNumber);
        }
    }
}
