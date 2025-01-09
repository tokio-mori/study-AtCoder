package com.example.RIKAI.dataKouzou.treeKouzou;

import java.util.Scanner;

public class NibunTree {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 高さnを入力
        int n = scanner.nextInt();
        
        // ノード数を計算
        int nodeCount = (1 << n) - 1; // 2^n - 1 の計算
        
        // 結果を出力
        System.out.println(nodeCount);
        scanner.close();
    }
}