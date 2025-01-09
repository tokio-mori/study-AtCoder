package com.example.RIKAI.dataKouzou.hairetsuAndList.map;

import java.util.HashMap;

public class HashMapPtn {

    // 特性: キーと値のペアを管理するが、順序は保証されない。高速。
    // 整数配列の要素とその出現回数を求める。
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 5, 1, 3, 2};

        // 頻度カウント
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 結果の出力
        for (int key : frequencyMap.keySet()) {
            System.out.println("Number " + key + ": " + frequencyMap.get(key) + " times");
        }
    }
}
