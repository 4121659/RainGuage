public class Users {
    private String name;
    private String username;
    private int userID;
    private String password;

    public Users(String name, String username, int userID, String password) {
        this.name = name;
        this.username = username;
        this.userID = userID;
        this.password = password;
    }

    public void login() {
        System.out.println("User " + username + " is logged in.");
    }

    public void logout() {
        System.out.println("User " + username + " is logged out.");
    }

    // getter methods for the attributes
    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public int getUserID() {
        return userID;
    }

    // setter method for the password
    public void setPassword(String password) {
        this.password = password;
    }
}
