package com.kh.testEx.test3pre;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentScoreManager {
    // 점수 출력 기능 메서드
    public static void checkingPassNoPass(Map<String, Integer> student) {
        System.out.println("---- Pass / NoPass ----");
        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            if (entry.getValue() >= 80) {
                System.out.println(entry.getKey() + " : 합격");
            } else {
                System.out.println(entry.getKey() + " : 불합격");
            }
        }
    }
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<String, Integer>();
        Scanner scanner = new Scanner(System.in);

        student.put("김철수", 85);
        student.put("이영희", 92);
        student.put("박민수", 77);
        student.put("최수진", 88);


        for (Map.Entry<String, Integer> entry : student.entrySet()) {
            System.out.println("name : " + entry.getKey());
            System.out.println("scores : " + entry.getValue());
        }

        checkingPassNoPass(student);
        System.out.println("---- Edit info then Pass / NoPass ----");
        try  {
            System.out.print("이름을 입력하세요 : ");
            String name = scanner.nextLine();
            if (!student.containsKey(name)) {
                throw new NumberFormatException();
            }
            System.out.print("점수를 입력하세요 : ");
            int score = Integer.parseInt(scanner.nextLine());

            student.put(name, score);
            checkingPassNoPass(student);
        } catch (NumberFormatException e) {
            System.out.println("잘못 입력하였습니다.");
        }

    }
}
