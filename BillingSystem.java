import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private int quantity;
    private double price;

    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("%-15s %5d %10.2f %10.2f", name, quantity, price, getTotal());
    }
}

public class BillingSystem {
    private static ArrayList<Item> items = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n=== SIMPLE BILLING SYSTEM ===");
            System.out.println("1. Add Item");
            System.out.println("2. View Bill");
            System.out.println("3. Print Receipt & Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addItem();
                case 2 -> viewBill();
                case 3 -> printReceipt();
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 3);
    }

    private static void addItem() {
        System.out.print("Enter item name: ");
        String name = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter price per unit: ");
        double price = scanner.nextDouble();

        items.add(new Item(name, quantity, price));
        System.out.println("✅ Item added successfully!");
    }

    private static void viewBill() {
        if (items.isEmpty()) {
            System.out.println("No items added yet!");
            return;
        }

        System.out.println("\nItem Name        Qty      Price     Total");
        System.out.println("-------------------------------------------");
        double grandTotal = 0;
        for (Item item : items) {
            System.out.println(item);
            grandTotal += item.getTotal();
        }
        System.out.println("-------------------------------------------");
        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }

    private static void printReceipt() {
        System.out.println("\n=== RECEIPT ===");
        viewBill();
        System.out.println("Thank you for shopping! 🛒");
    }
}
