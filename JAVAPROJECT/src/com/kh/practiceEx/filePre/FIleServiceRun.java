package com.kh.practiceEx.filePre;

import java.io.File;
import java.io.IOException;

public class FIleServiceRun {
    public static void main(String[] args) {
        FileService fileService = new FileService();

        // 파일에 작성할 내용
        // 맛있는 음식 목록 : 줄바꿈 - 피자 줄바꿈 - 치킨 줄바꿈 - 초밥 줄바꿈 - 파스타
        // createFile 기능 호출 자료형 없는 매개변수명으로 파일작성내용 넣어주기

        String content = "맛있는 음식 목록 : \n- 피자\n- 치킨\n- 초밥\n- 파스타";
        String path = System.getProperty("user.home") + "/OneDrive/Desktop/";
        String fileName = "food.docs";

        File file = new File(path + fileName);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("파일 생성 중 오류 발생");
            }
        }

        //fileService.createFile(content);
        //fileService.readFile();
        fileService.appendToFile("\n- 햄버거\n- 돈까스\n- 쌀국수\n- 카레");
    }
}
