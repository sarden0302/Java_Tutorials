package com.kh.inheritanceEx;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class 자식 extends 부모 {
    // field
    private String computer;

    // constructor
    public 자식(String computer) {
        super();
        this.computer = computer;
    }

    public 자식(int money, String car, String computer) {
        super(money, car);
        this.computer = computer;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", computer=" + computer;
    }
}
