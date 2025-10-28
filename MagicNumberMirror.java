import java.util.*;

public class MagicNumberMirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🔮 Welcome to the Magic Number Mirror! 🔮");
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Reverse the number
        int reversedNum = reverseNumber(num);

        // Convert to binary and reverse the binary string
        String binary = Integer.toBinaryString(num);
        String reversedBinary = new StringBuilder(binary).reverse().toString();

        // Convert reversed binary back to number
        int binaryReversedNum = Integer.parseInt(reversedBinary, 2);

        System.out.println("\n🧮 Original Number: " + num);
        System.out.println("🔢 Reversed Number: " + reversedNum);
        System.out.println("💡 Binary Form: " + binary);
        System.out.println("🪞 Reversed Binary Form: " + reversedBinary + " (" + binaryReversedNum + ")");

        // Check if both reversed versions are equal
        if (reversedNum == binaryReversedNum) {
            System.out.println("\n✨ It's a MAGIC MIRROR number! ✨");
        } else {
            System.out.println("\n❌ Not a Magic Mirror number — try another one!");
        }
    }

    // Function to reverse a number
    static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
}
