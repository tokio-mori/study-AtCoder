package com.example.RENSYUMONDAI.kihonMondai;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IfSaidaichi {

	// 演習1-1
	// 四値の最大値を求めて表示
	public static void main(String[] args) {
		SpringApplication.run(IfSaidaichi.class, args);

		try (Scanner stdIn = new Scanner(System.in)) {
			int a, b, c, d;

			System.out.println("aの値");
				a = stdIn.nextInt();
			System.out.println("bの値");
				b = stdIn.nextInt();
			System.out.println("cの値");
				c = stdIn.nextInt();
			System.out.println("dの値");
				d = stdIn.nextInt();
			
			int max = a;
			if (b > max) {
				max = b;
			}
			if (c > max) {
				max = c;
			}
			if (d > max) {
				max = d;
			}

			System.out.println("最大値は" + max + "です");
		}
	}

}
