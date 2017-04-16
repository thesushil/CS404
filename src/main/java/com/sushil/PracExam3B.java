package com.sushil;

public class PracExam3B {

    // Problem 2
    public static void PrintWholePath(int s, int d, int[][] P) {
        if (s == d) System.out.println(s);
        else {
            System.out.print(s);
            PrintPath(s, d, P);
            System.out.printf(" %d\r\n", d);
        }
    }

    private static void PrintPath(int s, int d, final int[][] P) {
        if (P[s][d] <= 0) return;
        PrintPath(s, P[s][d], P);
        System.out.printf(" %d", P[s][d]);
        PrintPath(P[s][d], d, P);
    }

    // Problem 4
    public static int frequencyOfLargest(int n, final int[] A) {
        if (n <= 0) return 0;
        int max = A[0], maxCount = 1;
        for (int i = 1; i < n; i++) {
            if (A[i] > max) {
                max = A[i];
                maxCount = 1;
            } else if (A[i] == max) maxCount++;
        }
        return maxCount;
    }

    // Problem 5
    public static boolean allOptimalPathsAreDirectEdges(int n, int[][] W) {
        int[][] D = W.clone();
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++) {
                    if (D[i][j] > D[i][k] + D[k][j]) return false;
                }
        return true;
    }

    // Problem 6
    public static boolean A_is_subpath_of_B(final int[] A, final int[] B) {
        int n = B.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (A[i] == B[j]) {
                if (++i == A.length) return true;
            } else i = 0;
        }
        return false;
    }

}
