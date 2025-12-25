import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        char playAgain;

        do {
            int number = random.nextInt(100) + 1; // 1 to 100
            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean isCorrect = false;

            System.out.println("Welcome to the Number Game!");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println(" Congratulations! You guessed the correct number.");
                    System.out.println("Attempts used: " + attempts);
                    isCorrect = true;
                    break;
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println(" Too low!");
                }
            }

            if (!isCorrect) {
                System.out.println(" You have used all attempts.");
                System.out.println("The correct number was: " + number);
            }

            System.out.print("Do you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');

        System.out.println("Thanks for playing! ");
        sc.close();
    }
}
