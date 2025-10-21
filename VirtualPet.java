import java.util.Scanner;

public class VirtualPet {
    String name;
    int hunger = 50;   // 0 = full, 100 = very hungry
    int happiness = 50; // 0 = sad, 100 = very happy
    int energy = 50;   // 0 = tired, 100 = energetic

    public VirtualPet(String name) {
        this.name = name;
    }

    void feed() {
        hunger = Math.max(0, hunger - 20);
        happiness = Math.min(100, happiness + 5);
        System.out.println(name + " enjoyed the meal! 🍖");
    }

    void play() {
        if (energy <= 10) {
            System.out.println(name + " is too tired to play 😴. Try letting it rest!");
        } else {
            happiness = Math.min(100, happiness + 15);
            energy = Math.max(0, energy - 20);
            hunger = Math.min(100, hunger + 10);
            System.out.println(name + " had fun playing! 🎾");
        }
    }

    void sleep() {
        energy = Math.min(100, energy + 30);
        hunger = Math.min(100, hunger + 10);
        System.out.println(name + " took a nice nap 😌💤");
    }

    void showStatus() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Hunger: " + hunger + "/100");
        System.out.println("Happiness: " + happiness + "/100");
        System.out.println("Energy: " + energy + "/100");
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== 🐾 WELCOME TO VIRTUAL PET SIMULATOR ===");
        System.out.print("Enter your pet's name: ");
        String name = sc.nextLine();

        VirtualPet pet = new VirtualPet(name);

        int choice;
        do {
            pet.showStatus();
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Feed 🍖");
            System.out.println("2. Play 🎾");
            System.out.println("3. Sleep 😴");
            System.out.println("4. Exit 🚪");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.sleep();
                case 4 -> System.out.println("👋 Goodbye! " + name + " will miss you!");
                default -> System.out.println("❌ Invalid choice!");
            }
        } while (choice != 4);
    }
}
