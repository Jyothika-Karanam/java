import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] fortunes = {
            "You will soon receive good news! 📬",
            "An exciting opportunity is coming your way! 🚀",
            "You’ll meet someone who changes your life. 💫",
            "A big challenge will turn into success. 🏆",
            "Happiness is waiting just around the corner. 😊",
            "Be careful — a small mistake could cost you today. ⚠️",
            "You will travel to a new place soon! ✈️",
            "Someone secretly admires you. 💖",
            "Unexpected wealth may find its way to you. 💰",
            "Your creativity will shine brighter than ever. 🎨"
        };

        System.out.println("🔮 Welcome to the MYSTIC FORTUNE TELLER 🔮");
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.print("How are you feeling today (happy/sad/angry/excited)? ");
        String mood = sc.nextLine().toLowerCase();

        System.out.println("\n✨ Shuffling the cosmic energies... ✨");
        try {
            Thread.sleep(1500); // pause for dramatic effect
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String chosenFortune = fortunes[rand.nextInt(fortunes.length)];

        System.out.println("\n💫 " + name + ", based on your " + mood + " mood...");
        System.out.println("🔔 Your Fortune: " + chosenFortune);
        System.out.println("\n🌟 Have faith — destiny is smiling on you! 🌟");
    }
}
