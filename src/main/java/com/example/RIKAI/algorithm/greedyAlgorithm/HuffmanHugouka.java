package com.example.RIKAI.algorithm.greedyAlgorithm;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanHugouka {
    // 問題内容:
    // 文字列中の文字の出現頻度に基づいて、最適な二進法の符号を割り当てる問題です。
    // この問題は、文字列圧縮の基本的な方法であるHuffman符号化を求めるものです。

    // 解法:
    // Huffman符号化は、頻度が低い文字ほど長いビット列、頻度が高い文字ほど短いビット列を割り当てる方法です。
    // これを実現するためには、最小ヒープを用いて、最小の頻度の文字から順に二進木を構築します。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // 入力文字列
        Map<Character, Integer> freqMap = new HashMap<>();

        // 文字の出現頻度を計算
        for (char c : input.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // 最小ヒープを使ってノードを作成
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Huffman木の構築
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node merged = new Node('\0', left.freq + right.freq);
            merged.left = left;
            merged.right = right;
            pq.add(merged);
        }

        // 結果の符号化（省略された部分もあり、簡易的な出力）
        Node root = pq.poll();
        Map<Character, String> huffmanCode = new HashMap<>();
        generateHuffmanCode(root, "", huffmanCode);

        // 符号を出力
        for (Map.Entry<Character, String> entry : huffmanCode.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }

    // Huffman符号を生成する再帰関数
    private static void generateHuffmanCode(Node root, String code, Map<Character, String> huffmanCode) {
        if (root == null) {
            return;
        }
        if (root.c != '\0') {
            huffmanCode.put(root.c, code);
        }
        generateHuffmanCode(root.left, code + "0", huffmanCode);
        generateHuffmanCode(root.right, code + "1", huffmanCode);
    }
}

class Node {
    char c;
    int freq;
    Node left, right;

    Node(char c, int freq) {
        this.c = c;
        this.freq = freq;
        this.left = this.right = null;
    }
}
