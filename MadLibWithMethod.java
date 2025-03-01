import java.util.Scanner;

public class MadLibWithMethod {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for inputs
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter a direction: ");
        String direction = scanner.nextLine();

        // Call the method to display the Mad Lib story
        displayStory(animal, number, direction);

        // Close the scanner
        scanner.close();
    }

    // Method to generate and display the Mad Lib story
    public static void displayStory(String animal, int number, String direction) {
        System.out.println("\nHickory Dickory Dock.");
        System.out.println("The " + animal + " ran up the clock.");
        System.out.println("The clock struck " + number + ".");
        System.out.println("The " + animal + " ran " + direction + ".");
        System.out.println("Hickory Dickory Dock.");
    }
}
