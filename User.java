public class User {
    private String username;
    private String password;
    private boolean isLoggedIn;
    private String name;

    public User() {};

    public User(String username, String password, String name) {
        this.username = username;
        this.password = password;
        this.isLoggedIn = false;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn = isLoggedIn;
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn;
    }

}
