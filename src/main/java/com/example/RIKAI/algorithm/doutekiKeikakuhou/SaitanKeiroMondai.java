package com.example.RIKAI.algorithm.doutekiKeikakuhou;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class SaitanKeiroMondai {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 頂点の数
        int m = sc.nextInt(); // 辺の数
        
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph.get(u).add(new int[] {v, w});
            graph.get(v).add(new int[] {u, w});
        }
        
        // ダイクストラ法
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] {1, 0});
        
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];
            
            if (d > dist[u]) continue;
            
            for (int[] edge : graph.get(u)) {
                int v = edge[0];
                int w = edge[1];
                
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.add(new int[] {v, dist[v]});
                }
            }
        }
        
        System.out.println(dist[n]);
        sc.close();
    }
}