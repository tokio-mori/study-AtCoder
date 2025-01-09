package com.example.RIKAI.dataKouzou.stackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMondai {
    public static void main(String[] args) {
        // キューの初期化
        Queue<String> queue = new LinkedList<>();
        
        // 入力を処理
        String[] operations = {
            "enqueue Alice",
            "enqueue Bob",
            "enqueue Charlie",
            "dequeue",
            "enqueue David",
            "dequeue"
        };
        
        for (String operation : operations) {
            String[] parts = operation.split(" ");
            if (parts[0].equals("enqueue")) {
                // enqueue 操作
                queue.add(parts[1]);
            } else if (parts[0].equals("dequeue")) {
                // dequeue 操作
                System.out.println(queue.poll());
            }
        }
    }
}