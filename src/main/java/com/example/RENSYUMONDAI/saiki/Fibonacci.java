package com.example.RENSYUMONDAI.saiki;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("select to using method");
        Scanner scanner = new Scanner(System.in);
        int MAX = scanner.nextInt();
        scanner.close();

        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = 0;
        
        System.out.print(firstNumber + " ");
		System.out.print(secondNumber + " ");

        for (int i = 2; i < MAX; i++) {
            fibonacci = firstNumber + secondNumber;
            System.out.print(fibonacci + " ");

            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }
}