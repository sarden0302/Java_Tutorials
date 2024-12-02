package com.kh.conditionEx;

public class ConditionIfEx {
    /*
        if (조건) {
            조건이 true일 때 실행
        }
     */
    public void method1(int age) {
        // 조건 실행문이 1줄일 경우 {} 생략 가능
        if (age >= 19) System.out.println("성인입니다.");
        else if(age >= 14) System.out.println("청소년입니다.");
        else System.out.println("어린이 입니다.");
    }

    public void method0(int age) {
        System.out.println("---------- if / else if 내 {} 생략한 경우 ------");
        if (age >= 19) System.out.println("성인입니다.");
        else if(age >= 14) System.out.println("청소년입니다.");
        else System.out.println("어린이 입니다.");

        String result;


        System.out.println("---------- if / else if 내 {} 생략하고 결과 result로 전달하기 ------");
        if (age >= 19) result = "성인입니다.";
        else if(age >= 14) result = "청소년입니다.";
        else result = "어린이 입니다.";

        System.out.println(age + "에 따른 결과 : " + result);
    }
}
