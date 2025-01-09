package com.example.RENSYUMONDAI.sugakuMondai;

import java.util.Scanner;

public class SaishoKoubaisuLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // GCDを使ってLCMを計算
        int gcd = gcd(a, b);
        int lcm = (a * b) / gcd;
        
        System.out.println(lcm);
    }
    
    // 最大公約数を求める関数
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}