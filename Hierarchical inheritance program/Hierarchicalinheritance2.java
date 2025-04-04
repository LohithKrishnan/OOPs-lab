class User {
    String username;
    User(String username) {
        this.username = username;
    }
    void login() {
        System.out.println(username + " has logged in.");
    }
}

class Admin extends User {
    Admin(String username) {
        super(username);
    }
    void accessDashboard() {
        System.out.println("Admin " + username + " is accessing admin dashboard.");
    }
}

class Guest extends User {
    Guest(String username) {
        super(username);
    }
    void browseAsGuest() {
        System.out.println("Guest " + username + " is browsing the website.");
    }
}

public class Hierarchicalinheritance2 {
    public static void main(String[] args) {
        Admin admin = new Admin("admin123");
        Guest guest = new Guest("guest456");
        admin.login();
        admin.accessDashboard();
        System.out.println();
        guest.login();
        guest.browseAsGuest();
    }
}
