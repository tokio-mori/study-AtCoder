package com.example.RIKAI.algorithm.sort;

import java.util.Arrays;

public class AscPtn {

    //Arrays.sort: 配列のソート（デフォルトは昇順）。
    //Collections.sort: リストのソート。
    //Comparator: カスタム条件でソートする際に使用。
    //reverseOrder: 降順ソート。
    // クイックソートよりも高速
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr); // 昇順ソート
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 5, 8]
    }
}
