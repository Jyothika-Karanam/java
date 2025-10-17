import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int[] marks;
    int total;
    double average;
    char grade;

    Student(String name, int rollNo, int subjects) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new int[subjects];
    }

    void calculate() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;

        if (average >= 90) grade = 'A';
        else if (average >= 80) grade = 'B';
        else if (average >= 70) grade = 'C';
        else if (average >= 60) grade = 'D';
        else grade = 'F';
    }

    void display() {
        System.out.println("\n=== REPORT CARD ===");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class ReportCardSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== STUDENT REPORT CARD SYSTEM ===");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        Student s = new Student(name, rollNo, subjects);

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            s.marks[i] = sc.nextInt();
        }

        s.calculate();
        s.display();
    }
}
