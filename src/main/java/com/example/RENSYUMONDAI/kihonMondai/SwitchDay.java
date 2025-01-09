package com.example.RENSYUMONDAI.kihonMondai;

import java.util.Scanner;

public class SwitchDay {

	// 入力値から曜日の出力
	public static void main(String[] args) {

		System.out.println("入力値から曜日の出力");
		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		scanner.close();

		String result;
		switch (input) {
			case 1:
				result = "月曜日";
				break;
			case 2:
				result = "火曜日";
				break;
			case 3:
				result = "水曜日";
				break;
			case 4:
				result = "木曜日";
				break;
			case 5:
				result = "金曜日";
				break;
			case 6:
				result = "土曜日";
				break;
			case 7:
				result = "日曜日";
				break;
		
			default:
				result = "無効";
				break;
		}

		System.out.println(result);

	}
}

