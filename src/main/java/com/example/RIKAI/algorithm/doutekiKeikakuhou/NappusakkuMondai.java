package com.example.RIKAI.algorithm.doutekiKeikakuhou;

import java.util.Scanner;

public class NappusakkuMondai {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // アイテム数
        int W = sc.nextInt(); // ナップサックの容量
        
        int[] w = new int[n]; // 各アイテムの重さ
        int[] v = new int[n]; // 各アイテムの価値
        
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }
        
        // DPテーブル
        int[] dp = new int[W + 1];
        
        for (int i = 0; i < n; i++) {
            for (int j = W; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
        }
        
        System.out.println(dp[W]);
        sc.close();
    }
}