package com.example.RIKAI.algorithm.tansaku.senkeiTansaku;

public class AllSerarchPtn {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: " + arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}