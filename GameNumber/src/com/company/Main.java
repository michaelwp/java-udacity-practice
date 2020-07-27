/**
 * created by MichaelWP, 27072020
 * Part of Udacity Java OOP course
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int randomNumber = (int) (Math.random() * 100) + 1;
        System.out.println("Please guess number between 1 - 100");
        boolean hasWon = false;
        Scanner scanner = new Scanner(System.in);
        for (int i=10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Guess again:");
            int guess = scanner.nextInt();

            if (randomNumber > guess) {
                System.out.println("It's larger than " + guess + ".");
            } else if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            } else {
                hasWon = true;
                break;
            }
        }

        if (hasWon) {
            System.out.println("Correct.., you win !!");
        } else {
            System.out.println("Game over.., you lose !!");
            System.out.println("The number is, " + randomNumber);
        }
    }
}
