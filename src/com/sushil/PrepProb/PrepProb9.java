package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb9 {
    public static void test() {
        int[][] B = {{1,2,1}, {1,1,1}, {1,2,2}};
        System.out.println(hasTwoIdenticalRows(B.length, B));
    }

    public static boolean hasTwoIdenticalRows(int n, int[][] B) {
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = i1 + 1; i2 < n; i2++) {
                int j = 0;
                for (; j < n; j++) {
                    if (B[i1][j] != B[i2][j]) break;
                }
                if (j == n) return true;
            }
        }

        return false;
    }
}
