import java.util.ArrayList;
import java.util.Scanner;

class Room {
    int roomNumber;
    String type;
    boolean isBooked;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isBooked = false;
    }

    public String toString() {
        return "Room " + roomNumber + " (" + type + ") - " + (isBooked ? "Booked" : "Available");
    }
}

public class HotelBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Room> rooms = new ArrayList<>();

        // Sample rooms
        rooms.add(new Room(101, "Single"));
        rooms.add(new Room(102, "Double"));
        rooms.add(new Room(103, "Suite"));
        rooms.add(new Room(104, "Single"));
        rooms.add(new Room(105, "Double"));

        int choice;
        do {
            System.out.println("\n=== HOTEL BOOKING SYSTEM ===");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Checkout Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n--- Room List ---");
                    for (Room r : rooms) {
                        System.out.println(r);
                    }
                }
                case 2 -> {
                    System.out.print("Enter room number to book: ");
                    int num = sc.nextInt();
                    boolean found = false;
                    for (Room r : rooms) {
                        if (r.roomNumber == num) {
                            found = true;
                            if (!r.isBooked) {
                                r.isBooked = true;
                                System.out.println("✅ Room " + num + " booked successfully!");
                            } else {
                                System.out.println("❌ Room already booked!");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Room not found!");
                }
                case 3 -> {
                    System.out.print("Enter room number to checkout: ");
                    int num = sc.nextInt();
                    boolean found = false;
                    for (Room r : rooms) {
                        if (r.roomNumber == num) {
                            found = true;
                            if (r.isBooked) {
                                r.isBooked = false;
                                System.out.println("✅ Checked out from Room " + num + "!");
                            } else {
                                System.out.println("❌ Room was not booked!");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Room not found!");
                }
                case 4 -> System.out.println("Exiting... Thank you for using Hotel Booking System 🏨");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }
}
