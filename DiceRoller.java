import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Random rand = new Random();

        // Roll two dice
        int die1 = rand.nextInt(6) + 1; // Generates a number between 1 and 6
        int die2 = rand.nextInt(6) + 1;

        // Display the results
        System.out.println("You rolled:");
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
        System.out.println("Total: " + (die1 + die2));
    }
}