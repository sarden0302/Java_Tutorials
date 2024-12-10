package com.kh.practiceEx.filePre;

import java.io.*;

public class FileService {
    // File FileWriter 이용해서 바탕화면에 food.docs 생성하기
    // try - catch

    /** 파일 생성 및 작성하기 메서드
     * void createFile(String content)
     *
     * @param content
     */
    public void createFile(String content) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        // try() 내 FileWriter, FileReader, BufferedReader 작성 시 try 구문 종료시 close() 는 자동 실행
        try(FileWriter fw = new FileWriter(file)) {
            fw.write(content);
            System.out.println("파일이 성공적으로 생성되고, 내용이 작성되었습니다.");
        } catch (Exception e) {
            System.out.println("파일 생성 / 작성 중 오류 발생 : " + e.getMessage());
        }
    }

    /** FileReader BufferedReader
     *
     */
    public void readFile() {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        if (!file.exists()) {
            System.out.println("파일 생성 먼저 해주세요");
            return;
        }

        try (FileReader fr = new FileReader(path + fileName);
        BufferedReader br = new BufferedReader(fr)) {
            System.out.println("=== [" + file + "] 내용 ===");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다 : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("입출력 중 문제가 발생했습니다 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("파일 읽기 모드 중 오류 발생 : " + e.getMessage());
        }

    }

    /* TODO : 바탕화면에 있는 food.docs 파일에 이어쓰기 기능 설정해서
              이어서 음식 작성
              "\n- 햄버거\n- 돈까스\n- 쌀국수\n- 카레"
              File FileWriter
    */

    /** 파일 이어쓰기 기능
     *
     * @param content 파일내용
     */
    public void appendToFile(String content) {
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "food.docs";
        File file = new File(path + fileName);

        if (!file.exists()) {
            System.out.println("파일이 존재하지 않습니다.");
            return;
        }

        try(FileWriter fw = new FileWriter(file, true)) {
            fw.write(content);
            readFile();
        } catch (IOException e) {
            System.out.println("입출력 관련 에러가 발생했습니다 : " + e.getMessage());
        } catch (Exception e) {
            System.out.println("예기치 못한 에러가 발생했습니다 : " + e.getMessage());
        }
    }
}
