package com.kh.practice.todolist;

import java.io.*;

public class Todolist {

    public void creatingFile(String PATH, String FILE_NAME, String EXT_NAME) {
        File file = new File(PATH + FILE_NAME + EXT_NAME);
        try {
            file.createNewFile();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void readingFile(String PATH, String FILE_NAME, String EXT_NAME) {
        File file = new File(PATH + FILE_NAME + EXT_NAME);
        if (!file.exists()) {
            System.out.println("파일을 찾을 수 없습니다: " + FILE_NAME + ".txt 새로운 파일을 생성하거나 확인하세요.");
            return;
        }
        System.out.println("--- " + (FILE_NAME + EXT_NAME) + " ---");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writingFile(String PATH, String FILE_NAME, String EXT_NAME, String newList) {
        File file = new File(PATH + FILE_NAME + EXT_NAME);
        if (!file.exists()) {
            System.out.println("파일을 찾을 수 없습니다: " + FILE_NAME + ".txt 새로운 파일을 생성하거나 확인하세요.");
            return;
        }

        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("- " + newList);
        } catch (IOException e) {
            System.out.println("파일 작성 중 에러가 발생했습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }

    }



}
