package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb7 {
    public static void test(){
        int[][] B = {{1,2},{5,4}};
        System.out.println(allUnique_2D(B));
    }

    public static boolean allUnique_2D(int[][] B) {
        int n = B.length;
        for (int i1 = 0; i1 < n; i1++) {
            for (int j1 = 0; j1 < n; j1++) {
                for (int i2 = 0; i2 < n; i2++) {
                    for (int j2 = 0; j2 < n; j2++) {
                        if (B[i1][j1] == B[i2][j2] && !(i1 == i2 && j1 == j2)) return false;
                    }
                }
            }
        }
        return true;
    }

}
