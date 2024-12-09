package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;

public class StudentService {
    public static void main(String[] args) {

        /*
        student2와 student3

        student2 => if문을 이용해 프론트엔드에서 전달받은 값을 한 번 더 검증하고 DB에 전달된 값을 저장
        student3 => 프론트엔드에서 검증된 값을 저장하고 추가적으로 검증하고자 하는 값을 검증을 진행한 후 DB에 값을 저장
         */
        // 배열로 학생 0, 학생 1 생성하기
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student("홍길동", 10);

        Student student2 = new Student();
        String inputName = "김철수";
        if (inputName != null && inputName.length() <= 6) {
            student2.setName(inputName);
            System.out.println("이름이 성공적으로 저장되었습니다. " + inputName);
        } else {
            System.out.println("이름은 6글자 이하이어야하고, 빈 공간일 수 없습니다 : " + inputName + " 저장불가");
        }
        
        int inputAge = 18;
        if (inputAge != 0 /*&& inputAge.length() <= 100*/) {
            student2.setAge(inputAge);
            System.out.println("나이가 성공적으로 저장되었습니다. " + inputAge);
        } else {
            System.out.println("나이는 12살 이상 19세 이하만 작성할 수 있습니다\n어린이, 성인 입학불가");
        }

        String inputIdCard = "버스카드";
        if (inputIdCard != null && inputIdCard.length() <= 10) {
            student2.setIdCard(inputIdCard);
            System.out.println("기능이 추가되었습니다. : " + inputIdCard);
        } else {
            System.out.println("10자 이하의 기능만 추가기입이 가능합니다.");
        }

        // 매개변수 생성자를 이용해서 학생 3번은 이름 나이를 필수로 입력받되, idCard 선택적으로 set을 이용해서 추가.
        Student student3 = new Student("강말숙", 15);
        System.out.println("버스카드 기능 추가(선택사항 / 금액 10,000원)");
        String plusIdCard = "버스카드";
        if (plusIdCard != null && plusIdCard.length() <= 10) {
            student3.setIdCard(plusIdCard);
        } else {
            System.out.println("버스카드 기능 없이 학생증을 발급하겠습니다.");
        }

        // ArrayList를 이용해서 학생 0, 1, 2, 3의 목록 관리
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(students[0]);
        studentsList.add(students[1]);
        studentsList.add(student2);
        studentsList.add(student3);

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println(studentsList.get(i).toString());
        }

        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
