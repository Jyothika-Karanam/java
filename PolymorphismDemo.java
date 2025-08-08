// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Method Overloading
    void eat() {
        System.out.println("Animal is eating");
    }

    void eat(String food) {
        System.out.println("Animal is eating " + food);
    }
}

// Derived class
class Dog extends Animal {
    // Method Overriding
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Another derived class
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime Polymorphism
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myAnimal.makeSound(); // Outputs: Some generic animal sound
        myDog.makeSound();    // Outputs: Dog barks
        myCat.makeSound();    // Outputs: Cat meows

        // Compile-time Polymorphism
        myAnimal.eat();              // Outputs: Animal is eating
        myAnimal.eat("vegetables");  // Outputs: Animal is eating vegetables
    }
}