import java.util.Scanner;

public class WebWizardQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("✨ Welcome to the Web Wizard Quiz! ✨");
        System.out.println("Question: Which HTML tag is used to insert an image?");
        System.out.println("A) <img>");
        System.out.println("B) <image>");
        System.out.println("C) <src>");
        System.out.print("Your answer: ");

        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("a") || answer.equals("<img>")) {
            System.out.println("🎉 Correct! You’re officially a Web Wizard, Jyothika! 🧙‍♀️");
        } else {
            System.out.println("😬 Oops! The correct answer is <img>. But hey, every wizard learns through trial and error!");
        }

        scanner.close();
    }
}