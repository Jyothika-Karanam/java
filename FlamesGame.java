import java.util.Scanner;

public class FlamesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== FLAMES GAME ===");
        System.out.print("Enter first name: ");
        String name1 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");
        System.out.print("Enter second name: ");
        String name2 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        // Remove common letters
        StringBuilder name1Builder = new StringBuilder(name1);
        StringBuilder name2Builder = new StringBuilder(name2);

        for (int i = 0; i < name1Builder.length(); i++) {
            char ch = name1Builder.charAt(i);
            int index = name2Builder.indexOf(String.valueOf(ch));
            if (index != -1) {
                name1Builder.deleteCharAt(i);
                name2Builder.deleteCharAt(index);
                i--; // adjust index after deletion
            }
        }

        int count = name1Builder.length() + name2Builder.length();

        if (count == 0) {
            System.out.println("Both names are identical! You’re destined for something special 😄");
            return;
        }

        String flames = "FLAMES"; // F-L-A-M-E-S
        StringBuilder sb = new StringBuilder(flames);

        int index = 0;
        while (sb.length() > 1) {
            index = (count % sb.length()) - 1;
            if (index >= 0) {
                sb.deleteCharAt(index);
                sb = new StringBuilder(sb.substring(index) + sb.substring(0, index));
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        char result = sb.charAt(0);

        System.out.println("\n🔥 FLAMES Result 🔥");
        switch (result) {
            case 'F' -> System.out.println("F → Friends 👯");
            case 'L' -> System.out.println("L → Lovers 💕");
            case 'A' -> System.out.println("A → Affectionate 💖");
            case 'M' -> System.out.println("M → Marriage 💍");
            case 'E' -> System.out.println("E → Enemies 😈");
            case 'S' -> System.out.println("S → Siblings 👩‍❤️‍👨");
        }
    }
}
