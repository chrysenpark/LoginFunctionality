package com.chrysen.Entity;

public class User {

    private int id;
    private String email;
    private String username;
    private String password;
    private int score;

    public User(int id, String email, String username, String password, int score) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.score = score;
    }
    public User(){}

    public User(String username, String password){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
