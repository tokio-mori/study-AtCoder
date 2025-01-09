package com.example.RIKAI.dataKouzou.hairetsuAndList.map;

import java.util.LinkedHashMap;

public class LinkedHashMapPtn {
    
    public static void main(String[] args) {
        
        // 特性: 挿入順序を保持する。順序を気にする場合に便利。
        // ユーザーがアクセスしたページを記録し、記録順に表示する。
        String[] pages = {"home", "about", "contact", "home", "services"};

        // ページの訪問順序を記録
        LinkedHashMap<String, Integer> pageVisits = new LinkedHashMap<>();
        for (String page : pages) {
            pageVisits.put(page, pageVisits.getOrDefault(page, 0) + 1);
        }

        // 記録順に結果を出力
        for (String page : pageVisits.keySet()) {
            System.out.println("Page " + page + ": " + pageVisits.get(page) + " visits");
        }
    }
}
