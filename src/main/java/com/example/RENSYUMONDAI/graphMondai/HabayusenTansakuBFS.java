package com.example.RENSYUMONDAI.graphMondai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HabayusenTansakuBFS {
    
    // 解説：https://chatgpt.com/share/6776c51c-3018-8013-b18c-738062494bd8
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 頂点数
        int m = sc.nextInt(); // 辺の数

        // グラフの初期化
        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] graph = new ArrayList[n];
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

        int start = 0; // 始点を0とする（1-basedの場合は-1する）

        // BFS
        int[] distance = new int[n];
        Arrays.fill(distance, -1); // 未訪問を-1で初期化
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int neighbor : graph[node]) {
                if (distance[neighbor] == -1) { // 未訪問なら訪問する
                    distance[neighbor] = distance[node] + 1;
                    queue.add(neighbor);
                }
            }
        }

        // 結果を出力
        for (int i = 0; i < n; i++) {
            System.out.println("Distance to node " + (i + 1) + ": " + distance[i]);
        }
        sc.close();
    }
}