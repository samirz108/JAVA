abstract class Account {
    private String username;
    public Account(String username) {
        if (username == null || username.isEmpty()) throw new IllegalArgumentException("Invalid username");
        this.username = username;
    }
    public String getUsername() { return username; }
    public abstract void login();
}

class GoogleAccount extends Account {
    public GoogleAccount(String u) { super(u); }
    public void login() { System.out.println("Google user " + getUsername() + " logged in"); }
}

class FacebookAccount extends Account {
    public FacebookAccount(String u) { super(u); }
    public void login() { System.out.println("Facebook user " + getUsername() + " logged in"); }
}

class TwitterAccount extends Account {
    public TwitterAccount(String u) { super(u); }
    public void login() { System.out.println("Twitter user " + getUsername() + " logged in"); }
}

public class Q19_AccountLogin {
    public static void main(String[] args) {
        try {
            Account a1 = new GoogleAccount("ram123");
            Account a2 = new FacebookAccount("sita123");
            Account a3 = new TwitterAccount("hari123");
            a1.login();
            a2.login();
            a3.login();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
