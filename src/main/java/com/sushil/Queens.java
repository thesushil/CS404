package com.sushil;

public class Queens {

    public static void nQueens(int n) {
        int[] column = new int[n + 1];
        nQueensRec(0, n, column);
    }

    private static void nQueensRec(int i, int n, int[] column) {
        if (promising(i, n, column)) {
            if (i == n) printArray(n, column);
            else {
                for (int k = 1; k <= n; k++) {
                    column[i + 1] = k;
                    nQueensRec(i + 1, n, column);
                }
            }
        }
    }

    private static boolean promising(int i, int n, int[] column) {
        for (int j = 1; j < i; j++) {
            if (column[i] == column[j]) return false;
            if (i - column[i] == j - column[j]) return false;
            if (i + column[i] == j + column[j]) return false;
        }
        return true;
    }

    public static void blockCounter(int n) {
        int[] A = new int[n + 1];
        printAll(0, n, A);
    }

    private static void printAll(int i, int n, int[] A) {
        if (i == n) printArray(n, A);
        else
            for (A[i + 1] = 1; A[i + 1] <= n; A[i + 1]++)
                printAll(i + 1, n, A);
    }

    private static void printArray(int n, int[] A) {
        System.out.println();
        for (int i = 1; i <= n; i++)
            System.out.printf("%d ", A[i]);

    }
}
