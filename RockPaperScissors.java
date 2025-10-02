import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        int userChoice, computerChoice;

        System.out.println("=== ROCK - PAPER - SCISSORS ===");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            userChoice = scanner.nextInt();

            if (userChoice == 4) {
                System.out.println("Game Over. Thanks for playing!");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice! Try again.");
                continue;
            }

            computerChoice = random.nextInt(3) + 1;

            System.out.println("You chose: " + choices[userChoice - 1]);
            System.out.println("Computer chose: " + choices[computerChoice - 1]);

            if (userChoice == computerChoice) {
                System.out.println("It's a draw!");
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("🎉 You win!");
            } else {
                System.out.println("💻 Computer wins!");
            }
        }
    }
}
