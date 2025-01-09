package com.example.RIKAI.algorithm.tansaku.senkeiTansaku;

public class SenkeiTansakuBase {

    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 3, 9, 8};
        int target = 7;
        int result = linearSearch(arr, target);
        System.out.println("Target found at index: " + result);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // 目的の値が見つかった場合、インデックスを返す
            }
        }
        return -1;  // 見つからなかった場合は-1を返す
    }

}