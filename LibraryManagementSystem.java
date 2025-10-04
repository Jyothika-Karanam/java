import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private int id;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title.toLowerCase();
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Title: " + title + " | Author: " + author;
    }
}

public class LibraryManagementSystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== LIBRARY MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Remove Book by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> searchBook();
                case 4 -> removeBook();
                case 5 -> System.out.println("Exiting... Goodbye!");
                default -> System.out.println("Invalid choice, please try again!");
            }
        } while (choice != 5);
    }

    private static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String author = scanner.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("✅ Book added successfully!");
    }

    private static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library yet.");
            return;
        }
        System.out.println("\n--- List of Books ---");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    private static void searchBook() {
        System.out.print("Enter book title to search: ");
        String title = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().contains(title)) {
                System.out.println("Book Found: " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ No book found with title: " + title);
        }
    }

    private static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = scanner.nextInt();
        boolean removed = books.removeIf(b -> b.getId() == id);

        if (removed) {
            System.out.println("✅ Book removed successfully!");
        } else {
            System.out.println("❌ Book not found.");
        }
    }
}
