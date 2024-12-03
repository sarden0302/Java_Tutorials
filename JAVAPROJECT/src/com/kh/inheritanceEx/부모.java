package com.kh.inheritanceEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class 부모 {
    // field
    public static final String 성씨 = "강";
    private int money = 100_000_000;
    private String car = "제네시스";

    // Constructor
    public 부모() {
        super(); // Object를 물려받아 만들기 때문에 super() 존재함
    }


    public 부모(int money, String car) {
        this.money = money;
        this.car = car;
    }

    @Override
    public String toString() {
        return "money=" + money +
                ", car=" + car;
    }
}
