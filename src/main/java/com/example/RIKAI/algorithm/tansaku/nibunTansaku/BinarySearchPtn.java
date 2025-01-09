package com.example.RIKAI.algorithm.tansaku.nibunTansaku;

import java.util.Arrays;

public class BinarySearchPtn {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 7, 9};
        int key = 1;

        // 二分探索
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found. Insertion point: " + (-index - 1));
        }
    }
}
