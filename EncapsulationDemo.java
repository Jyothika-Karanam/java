// Class with encapsulated fields
class Dashboard {
    private String themeColor;  // private field
    private boolean notificationsEnabled;

    // Constructor
    public Dashboard(String color, boolean notify) {
        this.themeColor = color;
        this.notificationsEnabled = notify;
    }

    // Public getter for themeColor
    public String getThemeColor() {
        return themeColor;
    }

    // Public setter for themeColor
    public void setThemeColor(String color) {
        this.themeColor = color;
    }

    // Public getter for notificationsEnabled
    public boolean isNotificationsEnabled() {
        return notificationsEnabled;
    }

    // Public setter for notificationsEnabled
    public void setNotificationsEnabled(boolean enabled) {
        this.notificationsEnabled = enabled;
    }

    // Method to display dashboard settings
    public void showSettings() {
        System.out.println("Theme Color: " + themeColor);
        System.out.println("Notifications: " + (notificationsEnabled ? "Enabled" : "Disabled"));
    }
}

// Main class to test encapsulation
public class EncapsulationDemo {
    public static void main(String[] args) {
        Dashboard myDashboard = new Dashboard("Electric Blue", true);

        // Accessing fields via getters
        System.out.println("Initial Settings:");
        myDashboard.showSettings();

        // Modifying fields via setters
        myDashboard.setThemeColor("Neon Pink");
        myDashboard.setNotificationsEnabled(false);

        System.out.println("\nUpdated Settings:");
        myDashboard.showSettings();
    }
}