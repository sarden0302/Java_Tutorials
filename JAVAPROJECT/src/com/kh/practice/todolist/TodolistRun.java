package com.kh.practice.todolist;

import java.io.File;
import java.util.Scanner;

public class TodolistRun {
    private final static String PATH = System.getProperty("user.home") + "/OneDrive/Desktop/";
    private final static String FILE_NAME = "todolist"; // 기본 파일 이름
    private final static String EXT_NAME = ".txt"; // 기본 확장자명


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("==== To-Do 리스트 관리 ====");
        System.out.println("1. 기존 파일 불러오기");
        System.out.println("2. 새로운 파일로 시작하기");
        System.out.print("옵션을 선택하세요: ");
        String firstChoice = scanner.nextLine();

        Todolist todolist = new Todolist();

        switch (firstChoice) {
            case "1":
                System.out.print("불러올 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                String name = scanner.nextLine();
                break;
            case "2":
                System.out.print("새로운 To-Do 리스트 이름을 입력하세요(확장자 제외): ");
                name = scanner.nextLine();
                todolist.creatingFile(PATH, FILE_NAME, EXT_NAME);
                System.out.println("새로운 파일이 생성됩니다: " + FILE_NAME);
                break;
            default:
                System.out.println("잘못된 선택입니다. 기본 파일로 시작합니다: " + FILE_NAME + EXT_NAME);
        }

        boolean isTrue = true;
        while (isTrue) {
            System.out.println("\n==== To-Do 리스트 ====");
            System.out.println("1. 할 일 목록 보기");
            System.out.println("2. 할 일 추가");
            System.out.println("3. 종료");
            System.out.print("옵션을 선택하세요: ");
            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    System.out.print("확인할 To-Do 리스트 파일 이름을 입력하세요(확장자 제외): ");
                    String name = scanner.nextLine();
                    todolist.readingFile(PATH, name, EXT_NAME);
                    break;
                case 2:
                    System.out.print("새로운 할 일을 입력하세요:");
                    String newList = scanner.nextLine();
                    todolist.writingFile(PATH, FILE_NAME, EXT_NAME, newList);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    isTrue = false;
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
                    break;
            }
        }
    }
}
