package com.kh.variableEx;

// Variable = enable to change
public class Variable {
    public static void main(String[] args) {
        // 변수
        // 자료형 참조형
        // 자료형

        /*  기본 자료형
            boolean (1 byte)
            byte    (1 byte)    - b
            short   (2 byte)    - sh
            int     (4 byte)
            long    (8 byte)    - l

            float   (4 byte)    - f
            double  (8 byte)

            char    (2 byte)
         */

        /*  참조 자료형
            String - 작성하는 값이 곧 크기이기 때문에 크기를 가늠할 수 없음
                   - "" 사용해서 내용 작성
         */

        //변수 선언 : 메모리에 공간 생성

        boolean isTrue; // 컴퓨터 메모리에 boolean 저장공간 1 byte를 Stack영역에 생성

        // 값 대입 : 변수에 값을 집어 넣는 것 (이미 값이 존재하는 변수에 대입하면 -> 덮어쓰기)
        isTrue = true;

        // 변수선언 + 초기에 num1이라는 공간에 들어갈 값까지 한 번에 설정
        int num1 = 100;

    }
}
