package com.example.RIKAI.algorithm.tansaku.nibunTansaku;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchListPtn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 5, 7, 9);
        int key = 5;

        // 二分探索
        int index = Collections.binarySearch(list, key);
        if (index >= 0) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found. Insertion point: " + (-index - 1));
        }
    }
}