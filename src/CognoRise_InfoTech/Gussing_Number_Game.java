package CognoRise_InfoTech;

import java.util.Random;
import java.util.Scanner;

public class Gussing_Number_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int maxAttempts = 10;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it!");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (numberOfAttempts < maxAttempts && !hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if (userGuess < 1 || userGuess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfAttempts + " attempts.");
            }
        }

        if (!hasGuessedCorrectly) {
            System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + numberToGuess + ".");
        }

        scanner.close();

	}

}
