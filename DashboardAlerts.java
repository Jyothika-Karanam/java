// Abstract class defining the blueprint
abstract class Alert {
    String message;

    Alert(String message) {
        this.message = message;
    }

    // Abstract method to be implemented by subclasses
    abstract void display();
}

// Concrete subclass for a glowing alert
class GlowingAlert extends Alert {
    GlowingAlert(String message) {
        super(message);
    }

    @Override
    void display() {
        System.out.println("✨ GLOWING ALERT ✨: " + message);
    }
}

// Concrete subclass for a pop-up alert
class PopupAlert extends Alert {
    PopupAlert(String message) {
        super(message);
    }

    @Override
    void display() {
        System.out.println("🔔 POP-UP ALERT 🔔: " + message);
    }
}

// Main class to test abstraction
public class DashboardAlerts {
    public static void main(String[] args) {
        Alert alert1 = new GlowingAlert("Manual notification sent!");
        Alert alert2 = new PopupAlert("New user interaction detected!");

        alert1.display();
        alert2.display();
    }
}