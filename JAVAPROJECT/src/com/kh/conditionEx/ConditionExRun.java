package com.kh.conditionEx;

import java.util.Scanner;

public class ConditionExRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        ConditionPre cp = new ConditionPre();

        System.out.print("계절을 숫자로 입력하세요 : ");
        int season = Integer.parseInt(sc.nextLine());

        cp.method1(season);*/

        ConditionSwitchPre csp = new ConditionSwitchPre();
        System.out.print("숫자를 입력하세요 : ");
        int day = Integer.parseInt(sc.nextLine());

        csp.choiceDay(day);
    }
}
