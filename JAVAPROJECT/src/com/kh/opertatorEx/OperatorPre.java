package com.kh.opertatorEx;

public class OperatorPre {
    public static void main(String[] args) {
        System.out.println("----- 전위 연산자 -----");
        int a = 5;
        System.out.println("a의 값 : " + a);
        int result1 = ++a;
        System.out.println("a의 값 : " + a);
        System.out.println("result1의 값 : " + result1);

        System.out.println("----- 후위 연산자 -----");

        int b = 5;
        System.out.println("b의 값 : " + b);
        int result2 = b++;
        System.out.println("b의 값 : " + b);
        System.out.println("result2의 값 : " + result2);
    }
}
