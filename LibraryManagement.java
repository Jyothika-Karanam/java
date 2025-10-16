import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean isIssued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    public String toString() {
        return id + ". " + title + " by " + author + " - " + (isIssued ? "Issued" : "Available");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Sample books
        books.add(new Book(1, "The Alchemist", "Paulo Coelho"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "Java Programming", "James Gosling"));
        books.add(new Book(4, "Wings of Fire", "A.P.J. Abdul Kalam"));

        int choice;
        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. View Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Add Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Book List ---");
                    for (Book b : books) {
                        System.out.println(b);
                    }
                }
                case 2 -> {
                    System.out.print("Enter Book ID to issue: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.id == id) {
                            found = true;
                            if (!b.isIssued) {
                                b.isIssued = true;
                                System.out.println("✅ Book issued: " + b.title);
                            } else {
                                System.out.println("❌ Book already issued!");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Book not found!");
                }
                case 3 -> {
                    System.out.print("Enter Book ID to return: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Book b : books) {
                        if (b.id == id) {
                            found = true;
                            if (b.isIssued) {
                                b.isIssued = false;
                                System.out.println("✅ Book returned: " + b.title);
                            } else {
                                System.out.println("❌ This book was not issued.");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Book not found!");
                }
                case 4 -> {
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(books.size() + 1, title, author));
                    System.out.println("✅ Book added successfully!");
                }
                case 5 -> System.out.println("Exiting... 👋 Thank you for using Library System.");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 5);
    }
}
