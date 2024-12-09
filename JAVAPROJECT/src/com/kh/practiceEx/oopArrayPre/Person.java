package com.kh.practiceEx.oopArrayPre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    // field
    private String name;
    private int age;

    // Constructor
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name=" + name + ", age=" + age;
    }
}
