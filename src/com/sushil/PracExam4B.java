package com.sushil;

public class PracExam4B {

    public static int vertexWithHighestTotalWeight(int[][] W) {
        int n = W.length - 1, sumMax = 0, vMax = 1;
        for (int v = 1; v <= n; v++) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += W[v][i] + W[i][v];
            if (sum > sumMax) {
                sumMax = sum;
                vMax = v;
            }
        }
        return vMax;
    }

    public static int[] greedySolution(int n, int k, int[] D) {
        int[] sol = new int[k + 1];

        for (int c = 1; c <= k; c++) {
            int cn = 0;
            while (n > 0) {
                n -= D[c];
                cn++;
            }
            if (n == 0) {
                sol[c] = cn;
                return sol;
            }
            if (n < 0) {
                sol[c] = cn - 1;
                n += D[c];
            }
        }
        if (n > 0) sol[1] = -1;
        return sol;
    }

    public static int minSpanTreeCost_or_nonUnreachable(int n, int[][] W) {
        return 0;
    }

    public static void nonRecDijkstraPrintPath(int s, int d, int[] touch) {
        int n = touch.length - 1, k = 0;
        int[] path = new int[n + 1];

        while (s != d) {
            path[++k] = d;
            d = touch[d];
        }
        path[++k] = d;

        for (int i = k; i > 0; i--) {
            System.out.print(path[i]);
        }
    }

}