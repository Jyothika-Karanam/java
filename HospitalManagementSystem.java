import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    int id;
    String name;
    int age;
    String disease;

    Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }

    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Age: " + age + " | Disease: " + disease;
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patients = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== HOSPITAL MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search Patient by ID");
            System.out.println("4. Discharge Patient");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter disease: ");
                    String disease = sc.nextLine();
                    int id = patients.size() + 1;
                    patients.add(new Patient(id, name, age, disease));
                    System.out.println("✅ Patient added successfully!");
                }
                case 2 -> {
                    System.out.println("\n--- Patient List ---");
                    if (patients.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        for (Patient p : patients) {
                            System.out.println(p);
                        }
                    }
                }
                case 3 -> {
                    System.out.print("Enter patient ID to search: ");
                    int id = sc.nextInt();
                    boolean found = false;
                    for (Patient p : patients) {
                        if (p.id == id) {
                            System.out.println("Patient Found: " + p);
                            found = true;
                            break;
                        }
                    }
                    if (!found) System.out.println("❌ Patient not found!");
                }
                case 4 -> {
                    System.out.print("Enter patient ID to discharge: ");
                    int id = sc.nextInt();
                    boolean removed = patients.removeIf(p -> p.id == id);
                    if (removed) System.out.println("✅ Patient discharged successfully!");
                    else System.out.println("❌ Patient not found!");
                }
                case 5 -> System.out.println("Exiting... Stay healthy! 🏥");
                default -> System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }
}
