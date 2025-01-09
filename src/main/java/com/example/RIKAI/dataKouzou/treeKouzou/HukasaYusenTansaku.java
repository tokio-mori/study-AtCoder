package com.example.RIKAI.dataKouzou.treeKouzou;

import java.util.Scanner;

public class HukasaYusenTansaku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ノードの数n
        int n = scanner.nextInt();
        
        // ノードの値を入力
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(scanner.nextInt());
        }

        // 二分木の構築
        for (int i = 0; i < n / 2; i++) {
            if (2 * i + 1 < n) nodes[i].left = nodes[2 * i + 1];
            if (2 * i + 2 < n) nodes[i].right = nodes[2 * i + 2];
        }

        // DFSで訪問
        dfs(nodes[0]);
        scanner.close();
    }

    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }

    // 深さ優先探索（DFS）
    static void dfs(Node root) {
        if (root == null) {
            return;
        }
        // 自分を訪問
        System.out.print(root.value + " ");
        // 左の子を訪問
        dfs(root.left);
        // 右の子を訪問
        dfs(root.right);
    }
}