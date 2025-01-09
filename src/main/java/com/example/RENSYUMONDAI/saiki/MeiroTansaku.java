package com.example.RENSYUMONDAI.saiki;

import java.util.Scanner;

public class MeiroTansaku {
    static char[][] maze;
    static boolean[][] visited;
    static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        maze = new char[n][m];
        visited = new boolean[n][m];
        sc.close();
        
        sc.nextLine(); // 改行を消費
        
        int startX = -1, startY = -1;
        for (int i = 0; i < n; i++) {
            String row = sc.nextLine();
            for (int j = 0; j < m; j++) {
                maze[i][j] = row.charAt(j);
                if (maze[i][j] == 'S') {
                    startX = i;
                    startY = j;
                }
            }
        }

        if (dfs(startX, startY)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean dfs(int x, int y) {
        // 範囲外チェック
        if (x < 0 || x >= n || y < 0 || y >= m) {
            return false;
        }
        // ゴールに到達したら成功
        if (maze[x][y] == 'G') {
            return true;
        }
        // 壁または既に訪れた場所は探索しない
        if (maze[x][y] == '#' || visited[x][y]) {
            return false;
        }
        visited[x][y] = true;
        
        // 上下左右に再帰的に探索
        if (dfs(x + 1, y) || dfs(x - 1, y) || dfs(x, y + 1) || dfs(x, y - 1)) {
            return true;
        }
        return false;
    }
}
