// Class with encapsulated fields
class Person {
    // Private fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}

// Main class to test encapsulation
public class Main {
    public static void main(String[] args) {
        // Creating an object of Person
        Person person = new Person("Alice", 25);

        // Accessing fields via getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Modifying fields via setters
        person.setName("Bob");
        person.setAge(30);

        // Display updated values
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());
    }
}