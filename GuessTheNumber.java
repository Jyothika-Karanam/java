import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int numberToGuess = rand.nextInt(100) + 1; // Random number between 1 and 100
        int attempts = 0;
        int guess = 0;

        System.out.println("🎯 Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100... Can you guess it?");

        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again 🔽");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again 🔼");
            } else {
                System.out.println("🎉 Congratulations! You guessed it in " + attempts + " attempts!");
            }
        }
        sc.close();
    }
}
