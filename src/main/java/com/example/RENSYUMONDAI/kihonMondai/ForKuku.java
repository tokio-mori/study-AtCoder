package com.example.RENSYUMONDAI.kihonMondai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForKuku {

	// 九九表の作成
	public static void main(String[] args) {
		SpringApplication.run(ForKuku.class, args);

		System.out.println("九九の表");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}


	}
}

