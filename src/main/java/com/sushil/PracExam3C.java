package com.sushil;

public class PracExam3C {

    public static int howManyOptimalPathsAreDirectEdges(int n, int[][] W) {
        int[][] D = W.clone(), P = new int[n + 1][n + 1];

        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++) {
                    int newD = D[i][k] + D[k][j];
                    if (D[i][j] > newD) {
                        D[i][j] = newD;
                        P[i][j] = k;
                    }
                }

        int count = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                if (P[i][j] == 0 && i != j) count++;
            }
        return count;
    }

    public static int indexOfVertexWithMaxNumberOfOutgoingEdges(int n, int[][] W) {
        int maxOutgoing = 0, maxOutgoingIndex = 1;
        for (int i = 1; i <= n; i++) {
            int outgoing = 0;
            for (int j = 1; j <= n; j++) {
                if (W[i][j] < Integer.MAX_VALUE && i != j) outgoing++;
            }
            if (outgoing > maxOutgoing) {
                maxOutgoing = outgoing;
                maxOutgoingIndex = i;
            }
        }
        return maxOutgoingIndex;
    }

    public static int indexOfVertexMostUsedAsStopover(int[][] P) {
        int n = P.length-1;
        int[] count = new int[n+1];

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                optimalPath(count, P, i, j);
            }

        int max = count[1], maxIndex = 1;
        for (int k = 2; k <= n; k++) {
            if (count[k] > max) {
                max = count[k];
                maxIndex = k;
            }
        }

        return maxIndex;
    }

    private static void optimalPath(int[] count, int[][] P, int s, int d) {
        if (P[s][d] == 0) return;
        optimalPath(count, P, s, P[s][d]);
        count[P[s][d]] += 1;
        optimalPath(count, P, P[s][d], d);
    }
}
