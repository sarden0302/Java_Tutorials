package com.kh.practiceEx.oopArrayPre;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    public void setSaveAllUser() {
        Scanner sc = new Scanner(System.in);

        User u = new User();

        System.out.print("Enter username(2자 이상 5자 이하): ");
        String uName = sc.nextLine();
        System.out.print("Enter email: ");
        String uEmail = sc.nextLine();
        if ((uName.length() < 2) || (uName.length() >= 6) || uEmail.isEmpty() || (uEmail.length() >= 30) ) {
            System.out.println("Invalid username or email");
            return;
        }
        User u1 = new User(uName, uEmail, 0);

        u.setName("홍길동");
        u.setAge(10);
        int age = 0;
        try {
            System.out.print("나이를 입력하세요 : ");
            age = Integer.parseInt(sc.nextLine());
            if (age == 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("빈칸 입력 불가");
        }

        if (age >= 100 || age < 0) {
            return;
        }

        u.setEmail("hong@hong.com");

        System.out.println("--------------- 저장된 사용자 정보 -----------------");
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(u);
        for (User user : userArrayList) {
            System.out.println(user);
        }
        sc.close();
    }

    // 매개변수 생성자 통해서 저장, 나이는 필수가 아님
    // 매개변수 생성자 -> 이름 / 이메일만 필수로 받도록 수정
    // 이메일을 입력하시곘습니까? yes/no 대소문자 구분없이 입력받기
    // yes 했다면 setEmail을 통해 입력 받은 이메일 값 저장

    public void paramNameEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String uName = sc.nextLine();
        String uEmail = "";
        System.out.print("이메일을 입력해주세요 : ");
        uEmail = sc.nextLine();
        User u = new User(uName, uEmail, 0);

        System.out.print("나이를 입력하시겠습니까? (y/n) : ");
        char yOrN = sc.nextLine().charAt(0);
        if (yOrN == 'y') {
            System.out.print("나이를 입력해주세요 : ");
            int age = Integer.parseInt(sc.nextLine());
            u.setAge(age);
        }
        System.out.println(u.toString());

    }
}
