package com.example.RENSYUMONDAI.mojiretsuSousa;

import java.util.Scanner;

public class BubunMojiretsu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if (s.contains(t)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}