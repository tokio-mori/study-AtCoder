package com.example.RENSYUMONDAI.kihonMondai;

import java.util.Scanner;

public class ForPyramid {

	// ピラミッドの作成
	public static void main(String[] args) {

		System.out.println("ピラミッドの高さ→");
		Scanner scanner = new Scanner(System.in);
		int inputHeight = scanner.nextInt();
		scanner.close();

		for (int currentRow = 1; currentRow <= inputHeight; currentRow++) {
			// 空白を出力
			// 中央沖じゃない場合は inputHeightのみになる
			for (int spaceCount = 1; spaceCount <= inputHeight - currentRow; spaceCount++) {
				System.out.print(" ");
			}
			// アスタリスクを出力
			for (int astarisc = 1; astarisc <= 2 * currentRow - 1; astarisc++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}

