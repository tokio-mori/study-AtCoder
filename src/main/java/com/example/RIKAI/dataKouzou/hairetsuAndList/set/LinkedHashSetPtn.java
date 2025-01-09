package com.example.RIKAI.dataKouzou.hairetsuAndList.set;

import java.util.LinkedHashSet;

public class LinkedHashSetPtn {
    public static void main(String[] args) {
        
        // 順序が重要な場合に便利
        // 重複を除きつつ、入力順序を保つ。
        String[] names = {"Alice", "Bob", "Charlie", "Alice", "Bob", "David"};

        LinkedHashSet<String> uniqueNames = new LinkedHashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }

        System.out.println("Names in insertion order: " + uniqueNames);
    }
}
