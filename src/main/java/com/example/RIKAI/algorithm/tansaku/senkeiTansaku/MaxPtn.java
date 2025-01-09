package com.example.RIKAI.algorithm.tansaku.senkeiTansaku;

public class MaxPtn {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9};
        int max = Integer.MIN_VALUE;
    
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
    
        }
        System.out.println("max value" + max);
    }
}
