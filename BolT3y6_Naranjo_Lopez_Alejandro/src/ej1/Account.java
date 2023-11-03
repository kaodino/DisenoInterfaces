package ej1;

public class Account {
    private String webSite;
    private String username;
    private String password;

    public Account(String webSite, String username, String password) {
        this.webSite = webSite;
        this.username = username;
        this.password = password;
    }

    public String getWebSite() {
        return webSite;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

