package com.example.RIKAI.dataKouzou.hairetsuAndList.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddAndRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("数値を入力");
        String[] input = scanner.nextLine().split(" ");

        for (String list : input) {
            numbers.add(Integer.parseInt(list));
        }

        // 奇数を削除する
        numbers.removeIf(num -> num % 2 != 0);

        System.out.println("Even numbers: " + numbers);
        scanner.close();
    }
}
