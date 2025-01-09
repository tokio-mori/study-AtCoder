package com.example.RIKAI.algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortPtn {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(3);

        Collections.sort(list); // 昇順ソート
        System.out.println(list); // [1, 2, 3, 5, 8]
    }
}
