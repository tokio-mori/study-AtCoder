package com.example.RIKAI.dataKouzou.hairetsuAndList.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamEditPtn {

    // stream の基本操作:
    // filter: 条件に基づいた要素の抽出。
    // map: 要素の変換。
    // sorted: ソート処理。
    // collect: 結果をリストや他の形式にまとめる。
    // count: 要素の個数を取得。
    // sum: 合計値を計算。
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 配列要素の置換
        System.out.print("Enter numbers separated by spaces: ");
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
        
        // 各要素を2倍にする
        List<Integer> doubled = numbers.stream()
                                       .map(num -> num * 2)
                                       .collect(Collectors.toList());

        // 結果を出力
        System.out.println("Doubled numbers: " + doubled);
        scanner.close();

    }
}
