package com.example.RENSYUMONDAI.hairetsuSousa;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class RuisekiWa {
    public static void main(String[] args) {
                // 元の配列
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // 累積和の計算 (Streamを使用)
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSumList = list.stream()
                .map(sum::addAndGet)  // addAndGetは現在の値に加算し、加算後の値を返す
                .collect(Collectors.toList());

        // 結果の出力
        System.out.println("元のリスト: " + list);
        System.out.println("累積和: " + cumulativeSumList);
    }
}