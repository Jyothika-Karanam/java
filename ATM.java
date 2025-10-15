import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000; // initial balance
        int choice, amount;

        do {
            System.out.println("\n=== ATM MACHINE ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("💰 Current Balance: Rs. " + balance);

                case 2 -> {
                    System.out.print("Enter amount to deposit: ");
                    amount = sc.nextInt();
                    if (amount > 0) {
                        balance += amount;
                        System.out.println("✅ Rs. " + amount + " deposited successfully!");
                    } else {
                        System.out.println("❌ Invalid deposit amount!");
                    }
                }

                case 3 -> {
                    System.out.print("Enter amount to withdraw: ");
                    amount = sc.nextInt();
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        System.out.println("✅ Rs. " + amount + " withdrawn successfully!");
                    } else {
                        System.out.println("❌ Insufficient balance or invalid amount!");
                    }
                }

                case 4 -> System.out.println("Thank you for using ATM. Goodbye! 👋");

                default -> System.out.println("❌ Invalid choice! Please try again.");
            }
        } while (choice != 4);
    }
}
