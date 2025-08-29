import java.util.Scanner;

public class NamePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("\n🔠 Stylized Pattern for: " + name + "\n");

        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}