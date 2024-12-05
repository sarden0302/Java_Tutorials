package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

public class ArraysPre {
    public void int1DArray() {
        int[] arr1 = {10, 300, 20, 50, 7000, 9999};
        int[] arr2 = {10, 300, 20, 50, 7000, 9999};

        // 1. Arrays toString을 이용해서 arr1과 arr2 출력
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        // 2. arr1 오름차순 정렬
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        // 3. arr1 안의 모든 값을 500으로 변경
        Arrays.fill(arr1, 500);
        System.out.println(Arrays.toString(arr1));

        // 4. arr1과 arr2의 값이 모두 같은지 비교하고 true false 출력
        System.out.println("arr1과 arr2이 같은가요? : " + Arrays.equals(arr1, arr2));
    }

    public void string1DArray() {
        String[] arr1 = {"apple", "banana", "cherry", "date", "elderberry"};
        String[] arr2 = {"apple", "banana", "cherry", "date", "elderberry"};

        //1.
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        //2.
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        //3.
        Arrays.fill(arr1, "mango");
        System.out.println(Arrays.toString(arr1));

        //4.
        System.out.println("arr1 과 arr2이 같은가요? : " + Arrays.equals(arr1, arr2));
    }

    public static void main(String[] args) {
        ArraysPre arraysPre = new ArraysPre();
        arraysPre.int1DArray();
        arraysPre.string1DArray();
    }
}
