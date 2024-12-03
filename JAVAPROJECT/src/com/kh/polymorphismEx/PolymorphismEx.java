package com.kh.polymorphismEx;

public class PolymorphismEx {
    /*
        다형성

        1. 상속 관계의 자식 객체의 모습이 여러 모습으로 보임
        2. Overloading
    */

    public void sum(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void sum(int num1, int num2, int num3) {
        System.out.println(num1 + num2 + num3);
    }

    public void sum(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public void sum(String num1, String num2) {
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    /********************************************************/

    public void method1(int i) {}

    public void method1(int i, String str) {}

    // 1번과 같이 int형을 받기 때문에 오버로딩 불가능
    //public void method1(int num) {}

    // 1번과 같이 int형을 받기 때문에 오버로딩 불가능
    //public void method1(int point) {}

    public char method1(int i, int k) { return 'a';}

    // 4번과 같은 형식의 method이름과 매개변수를 받기 때문에 오버로딩 불가능 (리턴 타입과 오버로딩은 상관 없다)
    // public void method1(int i, int k) {}

    // 2번과 같이 int, String 받기 때문에 오버로딩 불가능
    // public void method1(int num, String string) {}

    public void method1(String str, int i) {}

}
