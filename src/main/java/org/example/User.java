package org.example;

import java.util.Objects;

public class User {
    private String login;
    private String name;
    public String email;

    public User(String login, String password) {
        this.login = login;
        this.email = password;
    }

    public User(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(login, user.login) && Objects.equals(name, user.name) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, email);
    }

    @Override
    public String toString() {
        return "User{" +
                 name +
                '}';
    }
}
