package com.sushil;

public class PracExam3A {

    // Problem 5
    public static boolean isWeightedGraph(int n, int[][] B) {
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    if (B[i][j] != 0) return false;
                } else if (B[i][j] == 0) return false;
            }
        return true;
    }

    // Problem 7
    public static void Floyd(int n, final int[][] W, int[][] D, int[][] P) {
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                P[i][j] = 0;
        D = W.clone();
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++) {
                    int newD = D[i][k] + D[k][j];
                    if (D[i][j] > newD) {
                        D[i][j] = newD;
                        P[i][j] = k;
                    }
                }
    }

    // Problem 8
    public static void printPath(int source, int dest, final int[][] P) {
        if (P[source][dest] > 0) {
            printPath(source, P[source][dest], P);
            System.out.printf(" %d", P[source][dest]);
            printPath(P[source][dest], dest, P);
        }
    }

    // Problem 9
    public static boolean undirected(int n, int[][] W) {
        for (int i = 1; i <= n; i++)
            for (int j = 1; j < i; j++) {
                if (W[i][j] != W[j][i]) return false;
            }
        return true;
    }

    // Problem 10
    public static int noWayOut(int n, final int[][] W) {
        for (int i = 1; i <= n; i++) {
            boolean wayOut = false;
            for (int j = 1; j <= n; j++) {
                if (W[i][j] < Integer.MAX_VALUE) {
                    wayOut = true;
                    break;
                }
            }
            if (!wayOut) return i;
        }
        return -1;
    }

    // Problem 11
    public static int isolatedVertex(int n, final int[][] W) {
        for (int i = 1; i <= n; i++) {
            boolean isIsolated = true;
            for (int j = 1; j <= n; j++) {
                if (W[i][j] < Integer.MAX_VALUE || W[i][j] < Integer.MAX_VALUE) {
                    isIsolated = false;
                    break;
                }
            }
            if (isIsolated) return i;
        }
        return -1;
    }

    // Problem 12
    public static boolean allReachableFromEverywhere(int n, final int[][] W) {
        int[][] D = W.clone();
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++) {
                    int newDist = D[i][k] + D[k][i];
                    if (newDist < D[i][j]) D[i][j] = newDist;
                    if (k == n && D[i][j] == Integer.MAX_VALUE) return false;
                }
        return true;
    }

    // Problem 13
    public static int minCostRec(int s, int d, int[][] P, int[][] W) {
        if (P[s][d] == 0) return W[s][d];
        return minCostRec(s, P[s][d], P, W) + minCostRec(P[s][d], d, P, W);
    }

}
