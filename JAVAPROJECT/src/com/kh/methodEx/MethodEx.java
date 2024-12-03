package com.kh.methodEx;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MethodEx {
    private String name;

    @Override
    public String toString() {
        return "name='" + name;
    }

    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        System.out.println(methodEx.toString());
    }
}
