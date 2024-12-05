package com.kh.practiceEx.arrayPre;

import com.kh.arrayEx.ArrayEx;

import java.util.Arrays;
import java.util.Collections;

/*
    Arrays 클래스는 Java에서 배열을 다룰 때 유용한 다양한 기능을 제공

    기능들
    toString()
    deepToString()
    sort()
    fill()
    copyOf()
    equals()
    deepEquals()


 */
public class ArraysEx {
    public void arr1DMethod() {
        int[] arr1 = {5, 2, 8, 3, 1};
        int[] arr2 = {5, 2, 8, 3, 1};
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Integer[] arr22 = {5, 2, 8, 3, 1};
        Arrays.sort(arr22, Collections.reverseOrder()); // 데이터베이스에서 더 빠르다.
        System.out.println(Arrays.toString(arr2));

        Arrays.fill(arr1, 7);
        System.out.println("Arrays.fill(arr1, 7) = 모든 값을 7로 변경 : " + Arrays.toString(arr1));
        arr1 = new int[] {5, 2, 8, 3, 1};
        boolean a = Arrays.equals(arr1, new int[] {5, 2, 8, 3, 1});
        System.out.println("arr1과 new int[] {5, 2, 8, 3, 1}가 같은지 확인 : " + a );
    }

    public static void main(String[] args) {
        ArraysEx arraysEx = new ArraysEx();
        // arraysEx.기능명칭();
        arraysEx.arr1DMethod();
    }


}
