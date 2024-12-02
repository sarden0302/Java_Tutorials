package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionSwitchPre {
    /*
    *   사용자가 입력한 숫자에 따라 해당 숫자가 어떤 요일인지 출력하는 프로그램
    *   1~7까지의 숫자
    * */

    public void choiceDay(int day) {
        String result = "";

        switch(day) {
            case 1:
                result = "월요일";
                break;
            case 2:
                result = "화요일";
                break;
            case 3:
                result = "수요일";
                break;
            case 4:
                result = "목요일";
                break;
            case 5:
                result = "금요일";
                break;
            case 6:
                result = "토요일";
                break;
            case 7:
                result = "일요일";
                break;
            default:
                result = "잘못된 요일";
                break;
        }
        System.out.println(day + "의 요일은 [" + result + "]입니다.");
    }
}
