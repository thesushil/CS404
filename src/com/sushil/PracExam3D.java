package com.sushil;

public class PracExam3D {
    private static int GP = 2, MMP = 1;

    public static int opt_alignment(int i, int j, String x, String y) {
        int cost1, cost2, cost3;

        if (i == x.length()) return GP * (y.length() - j);
        if (j == y.length()) return GP * (x.length() - i);

        int mmp = 0;
        if (x.charAt(i) != y.charAt(j)) mmp = MMP; // Mismatch penalty
        cost1 = mmp + opt_alignment(i + 1, j + 1, x, y);

        cost2 = GP + opt_alignment(i + 1, j, x, y);
        cost3 = GP + opt_alignment(i, j + 1, x, y);

        int minCost = cost1;
        if (cost2 < minCost) minCost = cost2;
        if (cost3 < minCost) minCost = cost3;
        return minCost;
    }

    public static int[][] allOptAlign(String x, String y) {
        int m = x.length(), n = y.length();
        int[][] cost = new int[m + 1][n + 1];

        for (int i = m-1; i >= 0; i--) cost[i][n] = GP + cost[i + 1][n];
        for (int j = n-1; j >= 0; j--) cost[m][j] = GP + cost[m][j + 1];

        for (int i = m - 1; i >= 0; i--)
            for (int j = n - 1; j >= 0; j--) {
                int mmp = 0, cost1, cost2, cost3;

                if (x.charAt(i) != y.charAt(j)) mmp = MMP; // Mismatch penalty
                cost1 = mmp + cost[i + 1][j + 1];
                cost2 = GP + cost[i + 1][j];
                cost3 = GP + cost[i][j + 1];

                int minCost = cost1;
                if (cost2 < minCost) minCost = cost2;
                if (cost3 < minCost) minCost = cost3;

                cost[i][j] = minCost;
            }

        return cost;
    }

    public static char [][] getAlignment(String x, String y) {
        int[][] cost = allOptAlign(x, y);

        int m = x.length(), n = y.length();
        char[][] myAlign = new char[2][m + n];

        int i = 0, j = 0, k = 0;
        while (i < m || j < n) {
            if (i < m && cost[i][j] == GP + cost[i + 1][j]) {
                myAlign[0][k] = x.charAt(i++);
                myAlign[1][k] = '-';
            } else if (j < n && cost[i][j] == GP + cost[i][j + 1]) {
                myAlign[0][k] = '-';
                myAlign[1][k] = y.charAt(j++);
            } else if (i < m && j < n) {
                myAlign[0][k] = x.charAt(i++);
                myAlign[1][k] = y.charAt(j++);
            }
            k++;
        }

        return myAlign;
    }

    public static int costOfAlignment(String x, String y) {
        char[][] myAlign = getAlignment(x, y);
        int cost = 0, k = myAlign[0].length;

        for (int i = 0; i < k; i++) {
            if (myAlign[0][i] == '-' || myAlign[1][i] == '-') cost += GP;
            else if (myAlign[0][i] != myAlign[1][i]) cost += MMP;
        }

        return cost;
    }

}
