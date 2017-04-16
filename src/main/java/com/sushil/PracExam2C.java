package com.sushil;

public class PracExam2C {
    // Problem 1
    public static int combin_Rec(int n, int k) {
        if (n == 0 || k == 0 || n == k) return 1;
        return combin_Rec(n - 1, k - 1) + combin_Rec(n - 1, k);
    }

    // Problem 2
    public static int combin_NonRec(int n, int k) {
        int[][] C = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            C[0][i] = 1;
            C[i][i] = 1;
        }

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= k; j++) {
                if (i != j) C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }

        return C[n][k];
    }

    // Problem 3
    public static int combin_NonRecBetter(int n, int k) {
        int[][] C = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            C[i][0] = 1;
            C[0][i] = 1;
            C[i][i] = 1;
        }

        for (int i = 1; i <= n; i++) {
            int jStart = (i - n + k <= 0 ? 1 : i - n + k);
            int jEnd = (i < k ? i : k);
            for (int j = jStart; j <= jEnd; j++) {
                if (i != j) C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
        return C[n][k];
    }

    // Problem 4
    public static int numWays_NonRec(int amt, int k, int[] D) {
        if (amt < 0) return 0;
        int[][] ways = new int[amt + 1][k + 1];
        for (int i = 0; i <= k; i++) {
            ways[0][i] = 1;
        }
        for (int i = 0; i <= amt; i++) {
            ways[i][0] = 0;
            if (k > 0) ways[i][1] = 1;
        }

        for (int i = 1; i <= amt; i++)
            for (int j = 1; j <= k; j++) {
                int amt1 = i - D[j];
                ways[i][j] = (amt1 < 0 ? 0 : ways[amt1][j]) + ways[i][j - 1];
            }

        return ways[amt][k];
    }

    // Problem 5
    public static int two_to_n_Rec(int n) {
        if (n == 1) return 2;
        System.out.println(5555555);
        return two_to_n_Rec(n - 1) + two_to_n_Rec(n - 1);
    }

    // Problem 6
    public static int two_to_n_Dyn(int n) {
        int[] pow = new int[n + 1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) pow[i] = pow[i - 1] + pow[i - 1];
        return pow[n];
    }

    // Problem 7
    public static int trib(int n) {
        if (n <= 0) return 0;
        int[] t = new int[n + 1];
        if (n >= 1) t[1] = 1;
        if (n >= 2) t[2] = 2;
        if (n >= 3) t[3] = 4;
        for (int i = 4; i <= n; i++)
            t[i] = t[i - 1] + t[i - 2] + t[i - 3];
        return t[n];
    }
}
