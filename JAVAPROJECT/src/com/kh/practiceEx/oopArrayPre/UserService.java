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
}
