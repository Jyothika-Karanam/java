// Define the Student class
class Student {
    // Attributes (fields)
    String name;
    int age;
    String grade;

    // Constructor
    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Method to check if student is a minor
    boolean isMinor() {
        return age < 18;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student1 = new Student("Aarav", 16, "10th Grade");

        // Display student info
        student1.displayInfo();

        // Check if the student is a minor
        if (student1.isMinor()) {
            System.out.println(student1.name + " is a minor.");
        } else {
            System.out.println(student1.name + " is not a minor.");
        }
    }
}