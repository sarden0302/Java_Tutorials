package com.kh.testEx.test3pre;

import java.util.*;

public class StudentScoreManager {
    private static Set<String> studentSet = new HashSet<String>();
    static Scanner sc = new Scanner(System.in);
    public static void setMainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("학생 관리 프로그램");
            System.out.println("1. 학생 추가");
            System.out.println("2. 학생 삭제");
            System.out.println("3. 학생 목록 출력");
            System.out.println("4. 특정 학생 존재 여부 확인");
            System.out.println("5. 종료");
            System.out.print("메뉴 선택: ");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        addingStudent();
                        break;
                    case 2:
                        deleteStudent();
                        break;
                    case 3:
                        showingAll();
                        break;
                    case 4:
                        isExist();
                        break;
                    case 5:
                        exit = true;
                        return;
                    default:
                        System.out.println("1, 2, 3, 4, 5 중에 입력해주세요.");
                }

            } catch (NumberFormatException e) {
                System.out.println("잘못 선택하셨습니다 메인 화면으로 돌아갑니다.");
            }
        }
    }

    public static void isExist() {
        if (studentSet.isEmpty()) {
            System.out.println("현재 학생 명단은 비어있습니다.");
            return;
        }

        System.out.print("확인할 학생의 이름을 입력해주세요.");
        System.out.println( (studentSet.contains(sc.nextLine())) ? "존재합니다." : "존재하지 않습니다.");
    }

    public static void showingAll() {
        if (studentSet.isEmpty()) {
            System.out.println("현재 학생의 명단은 비어있습니다.");
            return;
        }

        for (String student : studentSet) {
            System.out.println(student);
        }
    }

    public static void addingStudent() {
        System.out.print("이름을 입력해주세요 : ");
        studentSet.add(sc.nextLine());
    }

    public static void deleteStudent() {
        if (studentSet.isEmpty()) {
            System.out.println("현재 학생 명단은 비어있습니다.");
            return ;
        }
        System.out.print("삭제할 학생의 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        if (studentSet.contains(name)) {
            studentSet.remove(name);
            System.out.println(name + "학생은 삭제되었습니다.");
            return;
        }
        System.out.println("해당 학생은 명단에 없습니다. 메인화면으로 돌아갑니다.");
    }

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
        /*
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
       */
        setMainMenu();

    }
}
