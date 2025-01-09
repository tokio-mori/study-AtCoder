package com.example.RENSYUMONDAI.saiki;

import java.util.Scanner;

public class KaijoFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // 基本ケース
        }
        return n * factorial(n - 1); // 再帰的な呼び出し
    }
}
