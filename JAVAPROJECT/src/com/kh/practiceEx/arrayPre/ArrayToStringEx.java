package com.kh.practiceEx.arrayPre;

import java.util.Arrays;

/*
    차원 次元 : 다음 차        차례, 다음 순서
              시작 원         원조, 기본적인 단위 시작 이라는 의미로 사용
    1D : 1-Dimension
    2D : 2-Dimension
 */
public class ArrayToStringEx {

    public void toString1DMethod() {
        int[] numbers = {1,2,3,4,5};

        System.out.println("numbers : " + numbers);
        System.out.println("Arrays.toString(numbers) : " + Arrays.toString(numbers));
        //deepToString은 2차원 이상부터 가능하기 때문에 1차원인 numbers 적용시 에러
        //System.out.println("Arrays.deepToString(numbers) : " + Arrays.deepToString(numbers));
    }

    public void toString2DMethod() {
        int[][] numbers = {{1,2,3},{4,5,6}, {7,8,9}};

        System.out.println("numbers : " + numbers);
        System.out.println("Arrays.toString(numbers) : " + Arrays.toString(numbers));
        System.out.println("Arrays.toString(numbers[0]) : " + Arrays.toString(numbers[0]));
        System.out.println("Arrays.deepToString(numbers) : " + Arrays.deepToString(numbers));
    }

    public static void main(String[] args) {
        ArrayToStringEx atse = new ArrayToStringEx();
        //atse.toString1DMethod();
        atse.toString2DMethod();
    }
}
