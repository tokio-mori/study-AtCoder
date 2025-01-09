package com.example.RIKAI.algorithm.sort;

import java.util.Arrays;
import java.util.Collections;

public class DescPtn {

    //Arrays.sort: 配列のソート（デフォルトは昇順）。
    //Collections.sort: リストのソート。
    //Comparator: カスタム条件でソートする際に使用。
    //reverseOrder: 降順ソート。
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 1, 3};
        Arrays.sort(arr, Collections.reverseOrder()); // 降順ソート
        System.out.println(Arrays.toString(arr)); // [8, 5, 3, 2, 1]
    }
}
