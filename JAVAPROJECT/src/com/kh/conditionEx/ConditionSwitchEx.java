package com.kh.conditionEx;

public class ConditionSwitchEx {
    /*

     */

    public void method1() {
        int a = 10;

        switch (a) {
            case 1:
                System.out.println("나이가 " + a + "입니다.");
                break;
            case 2:
                System.out.println("나이가 " + a + "입니다.");
                break;
            case 10:
                System.out.println("나이가 " + a + "입니다.");
                break;
            default:
                System.out.println("일치하는 나이가 없습니다.");
                break;
        }
    }

    public void method2() {
        int month = 10;
        String result;
        switch (month) {
            case 1: case 2: case 12:
                result = "겨울";
                break;
            case 3: case 4: case 5:
                result = "봄";
                break;
            case 6: case 7: case 8:
                result = "여름";
                break;
            case 9: case 10: case 11:
                result = "가을";
                break;
            default:
                result = "잘못된";
                break;
        }

        System.out.println(month + "는 [" + result + "] 계절입니다.");
    }

    public void method3() {
        int month = 10;
        String result;
        switch (month) {
            case 1, 2, 12:
                result = "겨울";
                break;
            case 3, 4, 5:
                result = "봄";
                break;
            case 6, 7, 8:
                result = "여름";
                break;
            case 9, 10, 11:
                result = "가을";
                break;
            default:
                result = "잘못된";
                break;
        }

        System.out.println(month + "는 [" + result + "] 계절입니다.");
    }

}
