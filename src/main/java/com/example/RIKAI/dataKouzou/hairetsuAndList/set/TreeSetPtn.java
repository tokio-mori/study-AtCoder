package com.example.RIKAI.dataKouzou.hairetsuAndList.set;

import java.util.TreeSet;

public class TreeSetPtn {
    
    public static void main(String[] args) {
        // ソートされた結果が必要な場合
        // 重複を除きつつ、自然順序でソート。
        int[] numbers = {5, 3, 8, 1, 2, 8, 3, 6};

        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        for (int num : numbers) {
            sortedNumbers.add(num);
        }

        System.out.println("Sorted unique numbers: " + sortedNumbers);
    }

}
