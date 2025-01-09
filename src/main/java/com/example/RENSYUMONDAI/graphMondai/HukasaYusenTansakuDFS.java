package com.example.RENSYUMONDAI.graphMondai;

import java.util.ArrayList;
import java.util.Scanner;

public class HukasaYusenTansakuDFS {

    // 深さ優先問題
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int size;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 頂点数
        int m = sc.nextInt(); // 辺の数

        // グラフの初期化
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // グラフの入力
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt() - 1; // 0-based index
            int v = sc.nextInt() - 1;
            graph[u].add(v);
            graph[v].add(u);
        }

        visited = new boolean[n];

        // DFSで連結成分のサイズを計算
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                size = 0;
                dfs(i);
                maxSize = Math.max(maxSize, size);
            }
        }

        System.out.println(maxSize);
        sc.close();
    }

    static void dfs(int node) {
        visited[node] = true;
        size++;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor);
            }
        }
    }
}

