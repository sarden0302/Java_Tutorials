package com.kh.practiceEx.filePre;

import java.io.File;
import java.io.FileWriter;

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
}
