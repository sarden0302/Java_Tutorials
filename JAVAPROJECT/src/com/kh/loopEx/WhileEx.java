package com.kh.loopEx;

import java.util.Scanner;

public class WhileEx {

    public void method1() {
        int sum = 0; // 합계 누적용 변수
        int input = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("---- 반복 시작 ---");
        while (input != -1) {
            //입력 값이 -1 아니면 반복
            System.out.print("입력 값 : ");
            input = Integer.parseInt(sc.nextLine());
            if (input != -1) sum += input;
        }
        System.out.println("합계 : " + sum);
    }
}
