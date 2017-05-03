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

    public static void backtrackColoringSolution(int n, int m, boolean[][] G) {
        int[] v = new int[G.length];

    }

    private static void mColoringSolutionRec() {

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

    public static int[] getForced3Coloring(int n, int[] vColor, boolean[][] G) {
        for (int loop = 3; loop <= n; loop++)
            for (int i = 1; i <= n; i++) {
                if (vColor[i] > 0) continue;
                force3Color(i, vColor, G);
            }
        return vColor;
    }

    private static void force3Color(int v, int[] vColor, boolean[][] G) {
        int n = vColor.length - 1;
        int v1 = 0, v2 = 0;
        for (int i = 1; i <= n; i++) {
            if (i != v && G[v][i] && vColor[i] > 0) {
                if (v1 == 0) v1 = i;
                else if (v2 == 0) v2 = i;
                else break;
            }
        }

        if(v1 == 0 || v2 == 0) return;

        for (int c = 1; c <= 3; c++)
            if (vColor[v1] != c && vColor[v2] != c) {
                vColor[v] = c;
                break;
            }
    }
}
