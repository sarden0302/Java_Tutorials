package com.kh.stringEx;

public class StringBuilderEx {
    public void method1() {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        System.out.println(s1.toString() + s1.hashCode());
        s1.append("World");
        System.out.println(s1.toString() + s1.hashCode());

    }
}
