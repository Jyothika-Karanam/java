// File: AccessModifiersDemo.java

class Person {
    public String name = "Alice";           // Accessible everywhere
    private int age = 30;                   // Accessible only within this class
    protected String address = "Wonderland"; // Accessible within package and subclasses
    String phone = "123-456-7890";          // Default: accessible within package

    public void showPublic() {
        System.out.println("Public Method: Name is " + name);
    }

    private void showPrivate() {
        System.out.println("Private Method: Age is " + age);
    }

    protected void showProtected() {
        System.out.println("Protected Method: Address is " + address);
    }

    void showDefault() {
        System.out.println("Default Method: Phone is " + phone);
    }

    public void accessPrivateMethod() {
        // Accessing private method from within the class
        showPrivate();
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Person p = new Person();

        // Accessing public member
        System.out.println("Name: " + p.name);
        p.showPublic();

        // Accessing private member - NOT ALLOWED directly
        // System.out.println("Age: " + p.age); // ❌ Compile Error
        p.accessPrivateMethod(); // ✅ Accessed via public method

        // Accessing protected member
        System.out.println("Address: " + p.address);
        p.showProtected();

        // Accessing default member
        System.out.println("Phone: " + p.phone);
        p.showDefault();
    }
}