package com.kh.testEx.test2pre;

import java.util.ArrayList;

public class SnackRun {
    private static ArrayList<Snack> snacks = new ArrayList<Snack>();

    public static void main(String[] args) {
        snacks.add(new Snack("포테이토칩", "짠맛", 1500));
        snacks.add(new Snack("초코파이", "단맛", 2000));
        snacks.add(new Snack("허니버터칩", "허니버터맛", 2500));

        for (Snack snack : snacks) {
            System.out.println(snack.toString());
        }

    }
}
