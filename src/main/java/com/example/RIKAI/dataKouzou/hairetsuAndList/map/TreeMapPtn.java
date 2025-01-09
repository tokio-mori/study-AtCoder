package com.example.RIKAI.dataKouzou.hairetsuAndList.map;

import java.util.TreeMap;

public class TreeMapPtn {
    public static void main(String[] args) {
        
        // 特性: キーを自然順序（または指定された順序）でソートして管理する。
        // 学生の名前とスコアを記録し、名前の辞書順で表示する。
        
        String[] names = {"Alice", "Bob", "Charlie", "Alice", "Bob"};
        int[] scores = {85, 90, 78, 88, 95};

        // 名前でソートされたスコアの累積
        TreeMap<String, Integer> scoreMap = new TreeMap<>();
        for (int i = 0; i < names.length; i++) {
            scoreMap.put(names[i], scoreMap.getOrDefault(names[i], 0) + scores[i]);
        }

        // 辞書順で結果を出力
        for (String name : scoreMap.keySet()) {
            System.out.println("Student " + name + ": " + scoreMap.get(name) + " points");
        }
    }
}
