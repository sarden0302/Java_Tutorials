package com.kh.oopEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Student {
    // field
    private String name;
    private int age;

    // constructor


    // method


    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age;
    }
}
