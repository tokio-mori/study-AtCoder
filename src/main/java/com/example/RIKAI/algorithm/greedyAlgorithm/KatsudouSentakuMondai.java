package com.example.RIKAI.algorithm.greedyAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class KatsudouSentakuMondai {
    // 問題内容:
    // 複数の活動が与えられ、その活動には開始時刻と終了時刻が与えられます。
    // 各活動は他の活動と重ならないように、最大数だけ選択する問題です。

    // 解法:
    // この問題も貪欲法で解けます。活動を終了時刻が早い順にソートし、最初から順番に選択していきます。
    // 選択する活動は、前回選んだ活動の終了時刻よりも開始時刻が遅いものです。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 活動の数
        int[][] activities = new int[n][2]; // 開始時刻と終了時刻

        // 活動の入力
        for (int i = 0; i < n; i++) {
            activities[i][0] = sc.nextInt(); // 開始時刻
            activities[i][1] = sc.nextInt(); // 終了時刻
        }

        // 終了時刻でソート
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int lastEndTime = 0;

        // 活動選択
        for (int i = 0; i < n; i++) {
            if (activities[i][0] >= lastEndTime) {
                count++;
                lastEndTime = activities[i][1]; // 終了時刻を更新
            }
        }

        System.out.println(count); // 最大数
        sc.close();
    }
}
