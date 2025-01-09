package com.example.RIKAI.algorithm.greedyAlgorithm;

import java.util.Scanner;

public class CoinRyougaeMondai {
    // 問題内容:
    // 与えられた金額を最小のコイン枚数で両替する問題です。
    // 例えば、1円、5円、10円、50円、100円、500円の6種類のコインを使って、指定された金額を最小枚数で作る方法を考えます。

    // 解法:
    // この問題は「貪欲法」（Greedy Algorithm）を使って解けます。
    // 基本的な考え方は、できるだけ大きなコインを使って金額を減らしていくことです。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt(); // 両替したい金額
        int[] coins = {500, 100, 50, 10, 5, 1}; // コインの種類
        int coinCount = 0;

        // 貪欲法でコインを使う
        for (int coin : coins) {
            coinCount += amount / coin; // 使えるコインの枚数
            amount %= coin; // 残りの金額
        }

        System.out.println(coinCount); // 最小枚数
        sc.close();
    }
}