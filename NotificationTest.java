// Base class
class Notification {
    protected String recipient;
    protected String message;

    public Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }

    public void send() {
        System.out.println("Sending notification to " + recipient);
        System.out.println("Message: " + message);
    }
}

// Subclass with expressive flair
class ExpressiveNotification extends Notification {

    public ExpressiveNotification(String recipient, String message) {
        super(recipient, message); // Call base class constructor
    }

    @Override
    public void send() {
        System.out.println("\n✨🔔 Expressive Notification Center 🔔✨");
        System.out.println("📨 To: " + recipient);
        System.out.println("💬 Message: " + message);
        System.out.println("🌈 Status: Sent with sparkle and style!");
        playSoundEffect(); // Optional playful enhancement
    }

    private void playSoundEffect() {
        System.out.println("🔊 *Ding!* Notification delivered 🎉");
    }
}

// Main class to run the program
public class NotificationTest {
    public static void main(String[] args) {
        ExpressiveNotification myNote = new ExpressiveNotification(
            "reader@gmail.com", 
            "Hey there! Your dashboard update is live 🚀"
        );
        myNote.send();
    }
}