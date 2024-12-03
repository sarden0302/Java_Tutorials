package com.kh.inheritanceEx;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class 손자 extends 부모 {
    //field
    private String 장난감;

    public 손자(String 성씨, int money, String car, String 장난감) {
        super(money, car);
        this.장난감 = 장난감;
    }

    @Override
    public String toString() {
        return super.toString() + "손자의 장난감=" + 장난감;
    }
}
