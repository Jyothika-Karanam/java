// Class representing a Dashboard
class Dashboard {
    String dashboardName;
    String themeColor;

    // Constructor
    Dashboard(String name, String color) {
        dashboardName = name;
        themeColor = color;
    }

    // Method to send a notification
    void sendNotification(String message, String recipientEmail) {
        System.out.println("🔔 [" + dashboardName + "] Notification sent to " + recipientEmail);
        System.out.println("Message: " + message);
        System.out.println("Theme: " + themeColor);
        System.out.println("Status: ✅ Delivered manually\n");
    }

    // Method to change the dashboard theme
    void updateTheme(String newColor) {
        themeColor = newColor;
        System.out.println("🎨 Theme updated to: " + themeColor + "\n");
    }
}

// Main class to run the program
public class DashboardDemo {
    public static void main(String[] args) {
        // Create a Dashboard object
        Dashboard myDash = new Dashboard("Jyothika's Expressive Panel", "Bold Pink");

        // Send a manual notification
        myDash.sendNotification("Your dashboard is live and glowing!", "reader@example.com");

        // Update the theme and send another notification
        myDash.updateTheme("Electric Blue");
        myDash.sendNotification("Theme changed successfully!", "reader@example.com");
    }
}