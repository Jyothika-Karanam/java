import java.util.Scanner;
import java.util.Random;

public class MoodFortune {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to the Mood-Based Fortune Generator!");
        System.out.print("How are you feeling today? (happy, sad, curious, tired): ");
        String mood = scanner.nextLine().toLowerCase();

        String[] happyFortunes = {
            "Joy will multiply when shared.",
            "A surprise awaits you in the next 24 hours.",
            "Your smile is contagious—use it wisely!"
        };

        String[] sadFortunes = {
            "Storms pass, and rainbows follow.",
            "Someone is thinking of you right now.",
            "Even the darkest night will end with sunrise."
        };

        String[] curiousFortunes = {
            "A new idea will spark a big change.",
            "Your questions will lead to unexpected answers.",
            "Explore boldly—your curiosity is your compass."
        };

        String[] tiredFortunes = {
            "Rest is not a weakness, it's a strategy.",
            "Recharge today, conquer tomorrow.",
            "Even machines need downtime—so do you."
        };

        String[] selectedFortunes;

        switch (mood) {
            case "happy":
                selectedFortunes = happyFortunes;
                break;
            case "sad":
                selectedFortunes = sadFortunes;
                break;
            case "curious":
                selectedFortunes = curiousFortunes;
                break;
            case "tired":
                selectedFortunes = tiredFortunes;
                break;
            default:
                System.out.println("Hmm, I don't recognize that mood—but here's a wild fortune anyway:");
                selectedFortunes = new String[] {
                    "The universe is plotting something delightful for you.",
                    "You’re about to stumble upon something magical.",
                    "Keep your eyes open—today holds a secret."
                };
        }

        int index = rand.nextInt(selectedFortunes.length);
        System.out.println("🔮 Your fortune: " + selectedFortunes[index]);
    }
}