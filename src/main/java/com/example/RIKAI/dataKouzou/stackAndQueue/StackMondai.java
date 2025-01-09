package com.example.RIKAI.dataKouzou.stackAndQueue;

import java.util.Stack;

public class StackMondai {
    public static void main(String[] args) {
        // スタックの初期化
        Stack<Integer> stack = new Stack<>();
        
        // 入力を処理
        String[] operations = {
            "push 1",
            "push 2",
            "push 3",
            "pop",
            "push 4",
            "pop"
        };
        
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            if (parts[0].equals("push")) {
                // push 操作
                stack.push(Integer.parseInt(parts[1]));
            } else if (parts[0].equals("pop")) {
                // pop 操作
                System.out.println(stack.pop());
            }
        }
    }
}
