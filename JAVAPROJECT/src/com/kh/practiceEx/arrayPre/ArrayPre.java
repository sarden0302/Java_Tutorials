package com.kh.practiceEx.arrayPre;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Arrays.toString(출력하고자 하는 array);
    Arrays.deepToString(출력하고자 하는 다차원 array);
*/

public class ArrayPre {

    // 1. 주어진 정수 배열에서 가장 큰 숫자를 찾아서 출력하기
    public void maxValue(){
        int[] numbers = {12, 45, 3, 22, 78, 10};

        // 배열에서 최대값을 찾아 출력
        numbers = IntStream.of(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(value -> value.intValue()).toArray();
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        } // for문이 종료된 다음에 결과를 출력
        System.out.println("최대값 : " + max);
        System.out.println("최대값 : " + numbers[0]);
    }

    // 2. 문자열 배열에서 특정 문자열 찾기 cherry 라는 단어가 어디에 위치했는지 찾아보기
    public void findString() {
        String[] words = {"apple", "banana", "cherry", "date", "melon"};
        String target = "cherry";
        for (int i = 0 ; i < words.length ; i++) {
            if (words[i].equals(target)) {
                System.out.println(i);
            }
        }
        List<String> wordsList = Arrays.asList(words);
        System.out.println(wordsList.indexOf("cherry"));
        System.out.println(Arrays.asList(words).indexOf("cherry"));
    }

    // 3. 배열에서 특정 숫자 교체하기
    public void replaceArrayNumber() {
        // 입력 배열
        int[] numbers = {10, 20, 30, 20, 40, 20, 320};
        int target = 20;

        int replaceNumber = 99;

        for (int i = 0 ; i < numbers.length ; i++) {
            if (numbers[i] == target) {
                numbers[i] = replaceNumber;
            }
            System.out.println("i : " + i + ", numbers : " + numbers[i]);
        }

        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int number : numbers) {
            numbersList.add(number);
        }

        numbersList.replaceAll(element -> element == 20 ?  99 : element);
        numbers = numbersList.stream().mapToInt(Integer::intValue).toArray();

        for(int number : numbers) {
            System.out.println(number);
        }

        List numberlist = Arrays.asList(numbers);

        Integer[] abc = numbersList.toArray(new Integer[0]);


    }

    // 4. 배열에서 특정 문자열 교체하기
    public void replaceArrayString() {
        String[] words = {"apple", "banana", "cherry", "banana", "date"};
        String target = "banana";
        String replacement = "mango";
        for (int i = 0 ; i < words.length ; i++) {
            if (words[i].equals(target)) {
                words[i] = replacement;
            }
            System.out.print("i : " + i + ", words : " + words[i]);
        }
    }

    public void print2DArray() {
        int[][] numbers = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
        }
    }

    public void find2DArray() {
        int[][] numbers = {{10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}};

        int target = 50;

        for (int i = 0 ; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    System.out.println("숫자 target은 [" + i + "][" + j + "]입니다.");
                }
            }
        }
    }

    public void findStringIn2DArray() {
        String[][] words = {
                {"cat", "dog", "fish"},
                {"parrot", "hamster", "rabbit"},
                {"turtle", "snake", "lizard"}
        };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].equals("rabbit")) {
                    System.out.println("rabbit은 [" + i + "][" + j + "]입니다.");
                }
            }
        }
    }

    //
    public void lunchMenuArray() {
        String[] lunchMenu = {"김치찌개", "된장찌개", "삼겹살", "초밥", "치킨", "햄버거"};

        System.out.println(Arrays.toString(lunchMenu));

    }

    public void lunchMenu2DArray() {
        String[][] lunchMenu = {
                {"김치찌개", "된장찌개", "불고기"},
                {"김치찌개", "된장찌개", "불고기"},
                {"김치찌개", "된장찌개", "불고기"}
        };
        System.out.println(Arrays.toString(lunchMenu));
        System.out.println(Arrays.deepToString(lunchMenu));
    }

    public void replaceString2DArray() {
        String[][] words = {
                {"red", "blue", "purple"},
                {"yellow", "blue", "purple"},
                {"pink", "blue", "orange"}
        };

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j].equals("blue")) {
                    words[i][j] = "cyan";
                }
                System.out.print(words[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.deepToString(words));
    }

    public static void main(String[] args) {
        ArrayPre arrayPre = new ArrayPre();
        //arrayPre.maxValue();
        //arrayPre.findString();
        //arrayPre.replaceArrayNumber();
        //arrayPre.replaceArrayString();
        //arrayPre.find2DArray();
        //arrayPre.findStringIn2DArray();
        //arrayPre.replaceString2DArray();
        arrayPre.lunchMenuArray();
        arrayPre.lunchMenu2DArray();

    }
}
