// Base class
abstract class Notification {
    protected String message;

    public Notification(String message) {
        this.message = message;
    }

    public abstract void send(); // Polymorphic method
}

// Subclass for Email
class EmailNotification extends Notification {
    private String recipientEmail;

    public EmailNotification(String message, String recipientEmail) {
        super(message);
        this.recipientEmail = recipientEmail;
    }

    @Override
    public void send() {
        System.out.println("📧 Email sent to " + recipientEmail + ": " + message);
    }
}

// Subclass for Popup
class PopupNotification extends Notification {
    public PopupNotification(String message) {
        super(message);
    }

    @Override
    public void send() {
        System.out.println("💬 Popup Alert: " + message);
    }
}

// Dashboard class
class Dashboard {
    public void triggerNotification(Notification notification) {
        System.out.println("🔔 Triggering Notification...");
        notification.send();
        System.out.println("✅ Notification delivered!\n");
    }
}

// Main class
public class NotificationApp {
    public static void main(String[] args) {
        Dashboard dashboard = new Dashboard();

        Notification email = new EmailNotification("You've got a new subscriber!", "reader@example.com");
        Notification popup = new PopupNotification("New comment on your dashboard!");

        dashboard.triggerNotification(email);
        dashboard.triggerNotification(popup);
    }
}