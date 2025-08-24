abstract class Notification {
    private String message;
    public Notification(String message) {
        if (message == null || message.isEmpty()) throw new IllegalArgumentException("Invalid message");
        this.message = message;
    }
    public String getMessage() { return message; }
    public abstract void send();
}

class EmailNotification extends Notification {
    public EmailNotification(String message) { super(message); }
    public void send() { System.out.println("Sending Email: " + getMessage()); }
}

class SMSNotification extends Notification {
    public SMSNotification(String message) { super(message); }
    public void send() { System.out.println("Sending SMS: " + getMessage()); }
}

class PushNotification extends Notification {
    public PushNotification(String message) { super(message); }
    public void send() { System.out.println("Sending Push: " + getMessage()); }
}

public class Q12_NotificationSystem {
    public static void main(String[] args) {
        try {
            Notification n1 = new EmailNotification("Exam schedule released");
            Notification n2 = new SMSNotification("Your OTP is 1234");
            Notification n3 = new PushNotification("New message received");
            n1.send();
            n2.send();
            n3.send();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
