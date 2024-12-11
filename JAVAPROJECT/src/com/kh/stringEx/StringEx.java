package com.kh.stringEx;

public class StringEx {
    /*
    String 대표적인 함수들
    String str = "안녕하세요";
        1. length
          ex) str.length -> 5 (int)

        2. charAt(int index)
          ex) str.charAt(1) -> '녕' (char)

        3. indexOf(String str)
          ex) str.indexOf("녕") -> 1 (int)

        4. lastIndexOf(String str)
          ex) str.lastIndexOf("녕") -> 1 (int)

        5. contains(String str)
          ex) str.contains("녕") -> true (boolean)

        6. equals(String str2)
          ex) str.equals("안녕하세요") -> true (boolean)

        7. equalsIgnoreCase(String str2)
          ex) str.equalsIgnoreCase("안녕하세요") -> true (boolean)

        8. toUpperCase() && toLowerCase()
          ex) str.toUpperCase() ->  (String)

        9. trim()
          ex) str.trim() -> 공백 제거하고 (String)으로 반환

        10. substring(int beginIndex, int endIndex)
          ex) str.substring(0, 1) -> "안녕" (String)

        11. replace(target, replacement)
          ex) str.replace("안녕", "1") -> "1하세요" (String)

        12. replaceAll(target, replacement)

        13. split(String regex) : 문자열을 정규식 기준으로 나누기

        14. concat(String str)
          ex) str.concat(". 반가워"); -> 안녕하세요. 반가워 (String)

        15. join(구분자, 결합1, 결합2, 결합3)

        16. isEmpty() : String이 null || ""
          ex) str.isEmpty() -> false (boolean)

        17. isBlank()  : String이 "" 인지 확인

     */

    public void methodString() {
        String str1 = "  Hello World!  ";
        String str2 = "hello";

        // 1. str1 문자열의 길이 반환
        System.out.println("str1 문자열 길이 : " + str1.length());

        // 2. str2의 문자의 index 1번의 문자가 무엇인지 확인
        System.out.println("str2 1번 위치의 문자열 : " + str2.charAt(1));

        // 3. str2 첫 번째 l 위치 반환
        System.out.println("str2 첫 번째 l의 위치 : " + str2.indexOf("l"));

        // 4. str2 마지막 l 위치 반환
        System.out.println("str2 마지막 l의 위치 : " + str2.lastIndexOf("l"));

        // 5. str1 World 라는 값이 포함되어 있는지 확인
        System.out.println("str1에 World 포함 되어있나요? : " + str1.contains("World"));

        // 6. str1, str2 대소문자 구분 비교
        System.out.println("str1, str2 비교 (대문자 구분 o) : " + str1.equals(str2));

        // 7. str1, str2 대소문자 구분 x 비교
        System.out.println("str1, str2 비교 (대문자 구분 x) : " + str1.equalsIgnoreCase(str2));

        // 8. str1 문자열을 모두 대문자로 변환
        System.out.println("str1 대문자 변환 : " + str1.toUpperCase());

        // 9. str1 문자열을 모두 소문자로 변환
        System.out.println("str1 소문자 변환 : " + str1.toLowerCase());

        // 10. str1 앞 뒤 공백 제거
        System.out.println("str1 공백 제거 : " + str1.trim());

        // 11. substring 이용해서 str3에 6번째부터 끝까지 자르기
        String str3 = "Hello Java World!";
        System.out.println(str3.substring(6));

        // 12. substring 이용해서 str3의 3 ~ 7까지만 자르기
        System.out.println(str3.substring(3, 7));

        // 13. Java를 HTML로 대체
        System.out.println(str3.replace("Java", "HTML"));

        // 14. concat str4를 str3와 결합
        String str4 = "let`s Learn!";
        System.out.println(str3.concat(str4));

        // 15. split 이용해서 str3 문자열 " " 기준으로 for-each 이용해서 출력
        String[] result = str3.split(" ");
        for (String r : result) {
            System.out.println(r);
        }
    }

    public static void main(String[] args) {
        StringEx stringEx = new StringEx();
        stringEx.methodString();
    }

    public void method1() {
        String str = "안녕하세요. 반갑습니다.";
        System.out.println(str + str.hashCode());
        str = "식사는 맛있게 하셨나요?";
        System.out.println(str + str.hashCode());
    }

    public void method2() {
        String str = "Hello";
        System.out.println(str + str.hashCode());
        str += "World";
        System.out.println(str + str.hashCode());
    }
}
