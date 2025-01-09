package com.example.RENSYUMONDAI.sugakuMondai;

import java.util.Scanner;

public class SosuHantei {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // 1は素数ではない
        if (n <= 1) {
            System.out.println("NO");
            return;
        }
        
        // 2は素数
        if (n == 2) {
            System.out.println("YES");
            return;
        }
        
        // 2以外の偶数は素数ではない
        if (n % 2 == 0) {
            System.out.println("NO");
            return;
        }
        
        // 3以上の奇数について判定
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                System.out.println("NO");
                return;
            }
        }
        
        System.out.println("YES");
    }
}