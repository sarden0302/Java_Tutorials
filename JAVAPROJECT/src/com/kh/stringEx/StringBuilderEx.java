package com.kh.stringEx;

public class StringBuilderEx {
    /*
        StringBuilder 기능들
        append(String str) : 문자열을 현재 문자열 끝에 추가
        insert(int index, String str) : 지정한 위치에 문자열 삽입
        delete(int start, int end) : 지정된 범위의 문자열 삭제
        deleteCharAt(int index) : 지정한 인덱스의 문자 하나를 삭제
        replace(int start, int end, String str) : 지정한 범위의 문자열을 다른 문자열로 대체
        reverse()                     : 문자열 뒤집음(거꾸로)
        length()                      : 문자열의 길이 반환
        charAt(int index)             : 지정한 위치의 문자 반환
        setCharAt(int index, char ch) : 지정한 위치의 문자를 다른 문자 하나로 변경
        substring(int start, int end) : 지정된 범위의 문자열 반환
        substring(int start)          : 지정된 위치부터 끝까지 반환
        trimToSize()                  : 내부 버퍼 크기를 현재 문자열 길이에 맞춤
        capacity()                    : 현재 내부 버퍼의 크기(용량) 반환
        ensureCapacity(int minimumSize) : 내부 버퍼의 용량을 최소 지정 용량으로 늘리기
     */
    public static void main(String[] args) {
        StringBuilderEx sb = new StringBuilderEx();
        sb.methodStringBuilder();
    }

    public void methodStringBuilder() {
        // sb1은 메모리에 sb1 공간은 생성되어 있지만 Heap에 저장된 값이 없는 상태
        StringBuilder sb1 = new StringBuilder();
        // sb2는 Stack에 sb2의 주소를 생성하고 Heap에 그 데이터 값을 저장
        StringBuilder sb2 = new StringBuilder("Hello");

        // 1. sb2에 World 문자열 추가
        sb2.append("World");
        System.out.println("1. World 문자 추가되었는지 확인 : " + sb2);

        // 2. insert 이용해서 6번째 위치에 Java 글자 삽입
        sb2.insert(5, " Java  ");
        System.out.println("2. Java 추가 확인 : " + sb2);

        // 3. replace 이용해서 6 ~ 10 범위를 Python으로 대체
        sb2.replace(6, 10, "Python");
        System.out.println("3. Java -> Python : " + sb2);

        // 4. 6 ~ 13 범위의 값 삭제
        sb2.delete(6, 13);
        System.out.println("4. Deleted from 6 to 13 : " + sb2);

        // 5. reverse 이용해서 sb2 문자열 뒤집기
        sb2.reverse();
        System.out.println("5. Reversed : " + sb2);

    }

    public void method1() {
        StringBuilder s1 = new StringBuilder();
        s1.append("Hello");
        System.out.println(s1.toString() + s1.hashCode());
        s1.append("World");
        System.out.println(s1.toString() + s1.hashCode());

    }
}
