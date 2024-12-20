package com.kh.practiceEx.oopArrayPre;

public class User {
    // field
    private String name;
    private String email;
    private int age;

    public User() {}

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.age = 0;
    }

    public User(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", email=" + email + ", age=" + age;
    }
}
