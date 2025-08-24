import java.util.ArrayList;
import java.util.Scanner;

class Task {
    String description;
    boolean isDone;

    Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    void markDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        return (isDone ? "[✓] " : "[ ] ") + description;
    }
}

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<>();

        while (true) {
            System.out.println("\n--- To-Do List Menu ---");
            System.out.println("1. Add Task");
            System.out.println("2. Mark Task as Done");
            System.out.println("3. View Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String desc = scanner.nextLine();
                    tasks.add(new Task(desc));
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.print("Enter task number to mark as done: ");
                    int index = scanner.nextInt();
                    if (index > 0 && index <= tasks.size()) {
                        tasks.get(index - 1).markDone();
                        System.out.println("Task marked as done!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
                    break;
                case 3:
                    System.out.println("\nYour Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}