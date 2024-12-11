package com.kh.stringEx;

public class StringBufferEx {

    public void method1() {
        StringBuffer sb = new StringBuffer();
        sb.append("Hello World");
        System.out.println(sb.toString() + sb.hashCode());
        sb.append("!");
        System.out.println(sb.toString() + sb.hashCode());

    }

}
