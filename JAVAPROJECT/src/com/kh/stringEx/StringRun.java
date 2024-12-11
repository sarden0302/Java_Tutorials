package com.kh.stringEx;

public class StringRun {

    /**
     * StringEx StringBuilderEx StringBufferEx 기능들 실행하는 공간
     * @param args

    public static void main(String[] args) {
        StringEx se = new StringEx();
        se.method1();
    } */

    public static void main(String[] args) {
        StringEx se = new StringEx();
        System.out.println("=== String ===");
        se.method1();

        StringBufferEx sbuffer = new StringBufferEx();
        System.out.println("=== StringBuffer ===");
        sbuffer.method1();

        StringBuilderEx sbuilder = new StringBuilderEx();
        System.out.println("=== StringBuilder ===");
        sbuilder.method1();

    }
}
