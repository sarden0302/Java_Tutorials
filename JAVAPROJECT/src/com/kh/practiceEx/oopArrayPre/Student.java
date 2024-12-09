package com.kh.practiceEx.oopArrayPre;

public class Student {
    // 멤버변수, 필드, 전역변수, 인스턴스 변수, 속성
    private String name;
    private int age; // 오류 최소화를 위해 String으로 받는다
    private String idCard;

    public Student() {

    }

    public Student(String name, int age/*, String idCard*/) {
        this.name = name;
        this.age = age;
        // this.idCard = idCard;
    }

    // idCard 를 선택사항일 때
    public Student(String name, int age, String idCard) {
        this.name = name;
        this.age = age;
        this.idCard = idCard;
    }
    /*  DB에 값을 저장하는 방식
        - 파라미터 생성시 저장
        ex) 회원가입
        - Setter
        ex) 로그인, 회원 정보 수정, 비밀번호 암호화 처리해서 저장할 때
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                '}';
    }
}
