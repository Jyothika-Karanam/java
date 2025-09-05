import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private ArrayList<Double> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(double grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public void printGrades() {
        System.out.println("Grades for " + name + ": " + grades);
        System.out.printf("Average: %.2f\n", getAverage());
    }
}

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\nGrade Tracker Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. View All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    students.add(new Student(name));
                    System.out.println("Student added.");
                    break;

                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.nextLine();
                    Student found = null;
                    for (Student s : students) {
                        if (s.getName().equalsIgnoreCase(studentName)) {
                            found = s;
                            break;
                        }
                    }
                    if (found != null) {
                        System.out.print("Enter grade: ");
                        double grade = scanner.nextDouble();
                        found.addGrade(grade);
                        System.out.println("Grade added.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    for (Student s : students) {
                        s.printGrades();
                    }
                    break;

                case 4:
                    System.out.println("Exiting Grade Tracker. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}