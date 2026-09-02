import java.util.Random;
import java.util.Scanner;

public class Lab20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int maxAttempts = 7;
        boolean guessed = false;

        System.out.println("================================");
        System.out.println("  Welcome to the Guessing Game!");
        System.out.println("  Guess a number between 1-100");
        System.out.println("  You have " + maxAttempts + " attempts!");
        System.out.println("================================");

        while (attempts < maxAttempts) {
            System.out.print("\nEnter your guess: ");
            int guess = input.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Too LOW! Try higher ⬆️");
            } else if (guess > secretNumber) {
                System.out.println("Too HIGH! Try lower ⬇️");
            } else {
                guessed = true;
                break;
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        System.out.println("\n================================");
        if (guessed) {
            System.out.println("  Correct! You guessed it! 🎉");
            System.out.println("  Attempts used: " + attempts);
        } else {
            System.out.println("  Game Over! 😞");
            System.out.println("  The number was: " + secretNumber);
        }
        System.out.println("================================");

        input.close();
    }
}
