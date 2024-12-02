package com.kh.variableEx;

// Constant : 상수 / 변하지 않는 값
// JS에 const와 같다
public class Constant {
    // static이 붙은 상수는 어디서든 접근 가능해서 Global 상수/ Global 변수
    public static final int NUMBER = 100;

    public static void main(String[] args) {

        Variable variable = new Variable();
        // 상수 : 한 번 값을 기록하면 값을 바꿀 수 없는 수
        // 상수 키워드 : final
        // 상수명 작성 : 대문자 작성, 연결되는 단어 사이는 "_" 구분 짓도록 개발자 규칙

        final double PI = 3.14159265358979323846;
        final int MIN = Integer.MIN_VALUE;
        final int MAX = Integer.MAX_VALUE;

        //보통 상수의 경우 어디서든 사용할 수 있도록 static을 앞에 붙여줌


    }
}
