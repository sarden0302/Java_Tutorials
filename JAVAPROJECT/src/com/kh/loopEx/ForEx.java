package com.kh.loopEx;

public class ForEx {

    public void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i의 값 : " + i);
        }
    }
    // for 문 또한 실행 기능이 1가지라면 {} 생략 가능
    public void method2() {
        for (int i = 0; i < 5; i++) System.out.println("i의 값 : " + i);
    }
}
