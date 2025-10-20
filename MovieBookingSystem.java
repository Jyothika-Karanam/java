import java.util.Scanner;

class Movie {
    String title;
    int availableSeats;
    int price;

    Movie(String title, int availableSeats, int price) {
        this.title = title;
        this.availableSeats = availableSeats;
        this.price = price;
    }

    public String toString() {
        return title + " | Tickets Left: " + availableSeats + " | Price: Rs." + price;
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample movies
        Movie[] movies = {
            new Movie("Avengers: Endgame", 50, 200),
            new Movie("Inception", 40, 180),
            new Movie("KGF Chapter 2", 60, 220),
            new Movie("The Lion King", 30, 150)
        };

        int choice;
        do {
            System.out.println("\n=== MOVIE TICKET BOOKING SYSTEM ===");
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Available Movies ---");
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println((i + 1) + ". " + movies[i]);
                    }
                }

                case 2 -> {
                    System.out.println("\nSelect Movie to Book:");
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println((i + 1) + ". " + movies[i]);
                    }
                    System.out.print("Enter movie number: ");
                    int movieChoice = sc.nextInt();

                    if (movieChoice < 1 || movieChoice > movies.length) {
                        System.out.println("❌ Invalid movie choice!");
                        break;
                    }

                    Movie selectedMovie = movies[movieChoice - 1];

                    System.out.print("Enter number of tickets: ");
                    int tickets = sc.nextInt();

                    if (tickets <= 0) {
                        System.out.println("❌ Invalid ticket count!");
                    } else if (tickets > selectedMovie.availableSeats) {
                        System.out.println("❌ Not enough seats available!");
                    } else {
                        selectedMovie.availableSeats -= tickets;
                        int totalCost = tickets * selectedMovie.price;
                        System.out.println("✅ Successfully booked " + tickets + " tickets for " + selectedMovie.title);
                        System.out.println("Total Price: Rs." + totalCost);
                    }
                }

                case 3 -> System.out.println("👋 Thank you for using Movie Ticket Booking System!");
                default -> System.out.println("❌ Invalid choice! Try again.");
            }
        } while (choice != 3);
    }
}
