package com.kh.collectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEx {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("사과", 1000);
        map.put("바나나", 2000);
        map.put("포도", 3000);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("사과의 가격 : " + map.get("사과") + "원입니다.");
        map.put("사과", 1500);
        System.out.println("물가가 올랐습니다." );
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.print("바나나 판매합니까? (y/n) : ");
        String sellingBanana = scanner.nextLine();

        if (sellingBanana.equals("y")) {
            map.remove("바나나");
        }
        System.out.println("3000원 짜리 과일이 존재합니까?");
        boolean existing3000 = false;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 3000) {
                existing3000 = true;
            }
        }
        System.out.println( (existing3000) ? "Yes" : "No");

        System.out.println("과일의 개수는 ? " + map.size());

        System.out.println("[모든 키 출력]");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
        System.out.println("[모든 값 출력]");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("[모든 키 && 모든 값 출력]");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


        HashMap<String, String> m2 = new HashMap<>();


    }
}
