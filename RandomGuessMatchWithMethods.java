import java.util.Scanner;

public class RandomGuessMatchWithMethods {
    public static void main(String[] args) {
        final int MIN = 1;
        final int MAX = 10;

        // Generate a random number between MIN and MAX (inclusive)
        int random = MIN + (int) (Math.random() * (MAX - MIN + 1));

        // Get user's guess
        int userGuess = getUserGuess(MIN, MAX);

        // Determine if the guess is correct
        boolean isCorrect = (userGuess == random);

        // Display the results
        displayResults(random, userGuess, isCorrect);
    }

    // Method to ask the user for a guess
    public static int getUserGuess(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between " + min + " and " + max + ": ");
        int guess = scanner.nextInt();
        scanner.close();
        return guess;
    }

    // Method to display results
    public static void displayResults(int random, int userGuess, boolean isCorrect) {
        System.out.println("Random number: " + random);
        System.out.println("Your guess: " + userGuess);
        System.out.println("Correct guess? " + isCorrect);
        System.out.println("Difference: " + Math.abs(random - userGuess));
    }
}
