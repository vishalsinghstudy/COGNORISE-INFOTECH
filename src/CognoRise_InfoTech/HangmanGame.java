package CognoRise_InfoTech;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = {"java", "python", "javascript", "hangman", "programming"};
    private static final int MAX_ATTEMPTS = 6;

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String wordToGuess = WORDS[random.nextInt(WORDS.length)];
        char[] guessedWord = new char[wordToGuess.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        List<Character> incorrectGuesses = new ArrayList<>();
        int attempts = 0;

        System.out.println("Welcome to Hangman!");
        System.out.println("Try to guess the word:");

        while (attempts < MAX_ATTEMPTS) {
            System.out.println("Word: " + new String(guessedWord));
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (wordToGuess.indexOf(guess) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        guessedWord[i] = guess;
                    }
                }
            } else {
                if (!incorrectGuesses.contains(guess)) {
                    incorrectGuesses.add(guess);
                    attempts++;
                }
                System.out.println("Incorrect guesses: " + incorrectGuesses);
                displayHangman(attempts);
            }

            if (new String(guessedWord).equals(wordToGuess)) {
                System.out.println("Congratulations! You've guessed the word: " + wordToGuess);
                break;
            }
        }

        if (attempts == MAX_ATTEMPTS) {
            System.out.println("Sorry, you've been hanged! The word was: " + wordToGuess);
        }

        scanner.close();
    }

    private static void displayHangman(int attempts) {
        switch (attempts) {
            case 1:
                System.out.println(" O ");
                break;
            case 2:
                System.out.println(" O ");
                System.out.println(" | ");
                break;
            case 3:
                System.out.println(" O ");
                System.out.println("\\| ");
                break;
            case 4:
                System.out.println(" O ");
                System.out.println("\\|/");
                break;
            case 5:
                System.out.println(" O ");
                System.out.println("\\|/");
                System.out.println("/  ");
                break;
            case 6:
                System.out.println(" O ");
                System.out.println("\\|/");
                System.out.println("/ \\");
                break;
            default:
                break;
        }
    }
}

