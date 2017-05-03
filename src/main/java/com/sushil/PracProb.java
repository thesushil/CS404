package com.sushil;

public class PracProb {
    public static boolean hasPairThatSumsToTarget(int[] A, int target) {
        int n = A.length - 1, iL = 1, iH = n;
        while (iL < iH) {
            int sum = A[iL] + A[iH];
            if (sum > target) iH--;
            else if (sum < target) iL++;
            else break;
        }

        return iL < iH;
    }

    public static void printOrderings(int n) {
        int[] A = new int[n + 1];
        printAllRec(0, n, A);
    }

    private static void printAllRec(int i, int n, int[] A) {
        if (promising(i, A))
            if (i == n) printArray(n, A);
            else
                for (A[i + 1] = 1; A[i + 1] <= n; A[i + 1]++)
                    printAllRec(i + 1, n, A);
    }

    private static boolean promising(int i, int[] A) {
        for (int j = 1; j < i; j++)
            if (A[i] == A[j]) return false;
        return true;
    }

    private static void printArray(int n, int[] A) {
        System.out.println();
        for (int i = 1; i <= n; i++)
            System.out.printf("%d ", A[i]);

    }

    public static boolean addOne(int[] A) {
        int n = A.length, a0 = A[0];

        for (int i = n - 1; i >= 0; i--) {
            if (A[i] == 0) {
                A[i] = 1;
                return true;
            } else A[i] = 0;
        }

        if(A[0] == 0 && a0 == 1) return false;
        return false;
    }

    public static boolean enoughEdgesForSpanningTree(int [][] W) {
        final int INF = 9;
        int n = W.length - 1, edgeCount = 0;
        for(int i = 1; i < n; i++)
            for(int j = i + 1; j <= n; j++)
                if(W[i][j] < INF) edgeCount++;

        if(edgeCount >= n-1) return true;
        return false;
    }
}
