package com.example.RIKAI.dataKouzou;

import java.util.Scanner;

public class TryCatchPtn {
    public static void main(String[] args) {
        
        // 例題: 入力として与えられる正の整数を受け取り、0になるまで減らし、その過程を出力する。
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("数値を入力");
            int input = scanner.nextInt();
            scanner.close();

            while (input > 0) {
                    System.out.println("現在の数値　→　" + input);
                    input--;    
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        System.out.println("終了");
    }
}
