package com.example.RIKAI.dataKouzou.hairetsuAndList.set;

import java.util.HashSet;

public class HashSetPtn {
    public static void main(String[] args) {
        
        // 順序を気にしない場合に最適
        // 重複する要素を除外して一意の要素のみを取得。
        int[] numbers = {1, 2, 3, 2, 1, 5, 3, 4};

        HashSet<Integer> uniqueNumbers = new HashSet<>();
        for (int num : numbers) {
            uniqueNumbers.add(num);
        }

        System.out.println("Unique numbers: " + uniqueNumbers);
    }
}
