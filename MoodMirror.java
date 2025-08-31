import java.util.Scanner;

public class MoodMirror {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("💬 How are you feeling today? (happy, sad, excited, tired, psycho)");
        String mood = scanner.nextLine().toLowerCase();

        switch (mood) {
            case "happy":
                System.out.println("😊 Yay! Keep smiling and spread the joy!");
                break;
            case "sad":
                System.out.println("😢 Sending virtual hugs. Brighter days are ahead!");
                break;
            case "excited":
                System.out.println("🎉 Woohoo! Let’s channel that energy into something epic!");
                break;
            case "tired":
                System.out.println("😴 Time for a break. You’ve earned it!");
                break;
            case "psycho":
                System.out.println("😜 Haha! You’re on a wild ride—just don’t forget your helmet!");
                break;
            default:
                System.out.println("🤔 Hmm, that’s a unique mood! You do you, superstar.");
        }

        scanner.close();
    }
}