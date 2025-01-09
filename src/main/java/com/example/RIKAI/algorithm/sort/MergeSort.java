package com.example.RIKAI.algorithm.sort;

import java.util.Scanner;

public class MergeSort {

    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("マージソート");
		System.out.print("要素数：");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for (int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
		}

		mergeSort(x, nx);		// 配列xをマージソート

		System.out.println("昇順にソートしました。");
		for (int i = 0; i < nx; i++)
			System.out.println("x[" + i + "]＝" + x[i]);

        stdIn.close();
	}

	static int[] buff;	// 作業用配列

	//--- マージソート ---//
	static void mergeSort(int[] x, int nx) {
		buff = new int[nx];			// 作業用配列を生成

		__mergeSort(x, 0, nx - 1);	// 配列全体をマージソート

		buff = null;					// 作業用配列を解放
	}

	//--- a[left]～a[right]を再帰的にマージソート ---//
	static void __mergeSort(int[] x, int left, int right) {
		if (left < right) {
			int i;
			int center = (left + right) / 2;
			int p = 0;
			int j = 0;
			int k = left;

			__mergeSort(x, left, center);		// 前半部をマージソート
			__mergeSort(x, center + 1, right);	// 後半部をマージソート

			for (i = left; i <= center; i++)
				buff[p++] = x[i];

			while (i <= right && j < p)
				x[k++] = (buff[j] <= x[i]) ? buff[j++] : x[i++];

			while (j < p)
				x[k++] = buff[j++];
		}
	}


}
