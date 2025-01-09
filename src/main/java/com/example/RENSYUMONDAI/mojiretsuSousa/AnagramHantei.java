package com.example.RENSYUMONDAI.mojiretsuSousa;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramHantei {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        // 文字列を配列に変換してソートし、比較する
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if (Arrays.equals(sArr, tArr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}