abstract class User {
    private String username;
    private String password;

    public User(String username, String password) {
        if (username == null || password == null) throw new IllegalArgumentException("Invalid credentials");
        this.username = username;
        this.password = password;
    }

    public String getUsername() { return username; }
    public abstract void login();
}

class Admin extends User {
    public Admin(String u, String p) { super(u, p); }
    public void login() { System.out.println("Admin " + getUsername() + " logged in"); }
}

class Editor extends User {
    public Editor(String u, String p) { super(u, p); }
    public void login() { System.out.println("Editor " + getUsername() + " logged in"); }
}

class Viewer extends User {
    public Viewer(String u, String p) { super(u, p); }
    public void login() { System.out.println("Viewer " + getUsername() + " logged in"); }
}

public class Q14_UserLogin {
    public static void main(String[] args) {
        try {
            User u1 = new Admin("root", "123");
            User u2 = new Editor("john", "abc");
            User u3 = new Viewer("guest", "xyz");
            u1.login();
            u2.login();
            u3.login();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
