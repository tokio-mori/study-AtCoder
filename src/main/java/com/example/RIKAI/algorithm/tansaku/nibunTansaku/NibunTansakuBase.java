package com.example.RIKAI.algorithm.tansaku.nibunTansaku;

public class NibunTansakuBase {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        int result = binarySearch(arr, target);
        System.out.println("Target found at index: " + result);
    }
        
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;  // 目的の値が見つかった場合、インデックスを返す
            }

            if (arr[mid] < target) {
                left = mid + 1;  // 右半分を探索
            } else {
                right = mid - 1;  // 左半分を探索
            }
        }
        return -1;  // 見つからなかった場合は-1を返す
    }
}