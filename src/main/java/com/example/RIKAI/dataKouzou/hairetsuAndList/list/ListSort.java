package com.example.RIKAI.dataKouzou.hairetsuAndList.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        // 要素をリストに追加
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        // 昇順にソート
        Collections.sort(numbers);

        // ソート後のリストを出力
        System.out.println("Sorted List: " + numbers);

        scanner.close();
    }
}
