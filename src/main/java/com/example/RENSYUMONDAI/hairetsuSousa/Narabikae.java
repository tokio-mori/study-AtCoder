package com.example.RENSYUMONDAI.hairetsuSousa;

import java.util.Arrays;
import java.util.Scanner;

public class Narabikae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 配列の長さの入力
        int N = sc.nextInt();
        int[] arr = new int[N];
        
        // 配列の入力
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        // 昇順に並び替え
        Arrays.sort(arr);
        
        // 結果の出力
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}