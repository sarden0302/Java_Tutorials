package com.kh.oopEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Nation {
    private String name;
    private int age;
    private String gender;

    @Override
    public String toString() {
        return "name='" + name +
                ", age=" + age +
                ", gender='" + gender;
    }
}
