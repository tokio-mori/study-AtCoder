package com.example.RIKAI.dataKouzou.hairetsuAndList.list;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListPtn {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.print("Enter numbers separated by spaces: ");
        String[] input = scanner.nextLine().split(" ");

        // 要素をLinkedListに追加
        for (String s : input) {
            numbers.add(Integer.parseInt(s));
        }

        // リストから奇数を削除
        numbers.removeIf(num -> num % 2 != 0);

        // 結果の出力
        System.out.println("Processed List: " + numbers);
        scanner.close();
    }
}