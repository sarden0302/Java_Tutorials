package com.kh.testEx.test1pre;

public class MemberRun {
    public static void main(String[] args) {
        Member m = new Member();
        m.setId("user1");
        m.setName("강길자");
        m.setPassword("pass1");

        if (m.getId().equals("user1") && m.getName().equals("강길자") && m.getPassword().equals("pass1")) {
            System.out.println("로그인 성공! 환영합니다.");
            return;
        }
        System.out.println("로그인 실패! 아이디 또는 비밀번호를 확인하세요.");

    }
}
