package com.sushil;

public class GraphColoring {

    public static int greedyColoring(int n, boolean[][] G, int[] v) {
        if (n <= 1) return n;
        int color = 0;
        boolean notDone = true;
        while (notDone) {
            color++;
            notDone = false;
            for (int i = 1; i <= n; i++) {
                if (v[i] > 0) continue;
                if (v[i] == 0) notDone = true;
                v[i] = color;
                if (!promising(i, G, v)) v[i] = 0;
            }
        }
        return color - 1;
    }

    public static void backtrackColoringSolution(int n, int m, boolean[][] G){
        int[] v = new int[G.length];

    }

    public static void mColoringSolutionRec(){

    }

    public static int backtrackColoringNumSolution(int n, int m, boolean[][] G) {
        int[] v = new int[G.length];
        int numOfSolution = mColoringNumSolutionRec(0, n, m, G, v);
        return numOfSolution;
    }

    private static int mColoringNumSolutionRec(int i, int n, int m, boolean[][] G, int[] v) {
        if (promising(i, G, v)) {
            if (i == n) return 1;
            int count = 0;
            for (int k = 1; k <= m; k++) {
                v[i + 1] = k;
                count += mColoringNumSolutionRec(i + 1, n, m, G, v);
            }
            return count;
        }
        return 0;
    }

    public static int backtrackColoring(int n, boolean[][] G, int[] v) {
        int m;
        for (m = 1; m < n; m++) { // n-1 is enought; no need to go upto n
            if (mColoringRec(0, n, m, G, v)) return m;
        }
        return m; // will return n if nothing works
    }

    private static boolean mColoringRec(int i, int n, int m, boolean[][] G, int[] v) {
        if (promising(i, G, v)) {
            if (i == n) return true;
            for (int k = 1; k <= m; k++) {
                v[i + 1] = k;
                if (mColoringRec(i + 1, n, m, G, v)) return true;
            }
        }
        return false;
    }

    private static boolean promising(int i, boolean[][] G, int[] v) {
        for (int k = 1; k < i; k++)
            if (G[i][k] && v[i] == v[k]) return false;
        return true;
    }

    private static void printArray(int[] arr) {
        int n = arr.length - 1;
        System.out.println();
        for (int i = 1; i <= n; i++)
            System.out.print(arr[i]);
    }
}
