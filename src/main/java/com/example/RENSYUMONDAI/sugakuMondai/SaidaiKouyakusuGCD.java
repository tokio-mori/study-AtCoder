package com.example.RENSYUMONDAI.sugakuMondai;

import java.util.Scanner;

public class SaidaiKouyakusuGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // ユークリッドの互除法でGCDを計算
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        System.out.println(a);
        sc.close();
    }
}
