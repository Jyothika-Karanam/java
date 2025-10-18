import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited: Rs. " + amount);
        } else {
            System.out.println("❌ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrawn: Rs. " + amount);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount!");
        }
    }

    public void checkBalance() {
        System.out.println("💰 Current Balance: Rs. " + balance);
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs. " + balance);
    }
}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a sample account
        BankAccount account = new BankAccount("Rahul Sharma", "ACC12345", 10000);

        int choice;
        do {
            System.out.println("\n=== BANK ACCOUNT MANAGEMENT SYSTEM ===");
            System.out.println("1. Account Details");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> account.displayDetails();
                case 2 -> account.checkBalance();
                case 3 -> {
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                }
                case 4 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                }
                case 5 -> System.out.println("👋 Thank you for banking with us!");
                default -> System.out.println("❌ Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}
