import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; // generates number between 1 and 100
        Scanner scanner = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            // Handle invalid input
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // discard invalid input
                System.out.print("Enter your guess: ");
            }

            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low!");
            } else if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
