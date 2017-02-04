package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/22/2017.
 */
public class PrepProb25 {
    public static void test() {
        int[][] B = {
                {10, 10, 0, 5},
                {1, 21, 6, 5},
                {0, 11, 30, 20},
                {1, 0, 1, 1}};
//        int[][] B = {
//                {10, 20, 10, 5, 5},
//                {30, 30, 30, 30, 30},
//                {20, 20, 40, 30, 10},
//                {5, 30, 30, 30, 20},
//                {10, 5, 50, 30, 40}};
        System.out.print(innerOrOuterOrTies(B.length, B));
    }

    public static String innerOrOuterOrTies(int n, int[][] B) {
        int sumInner = 0, sumOuter = 0, lastIndex = n - 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == lastIndex || j == 0 || j == lastIndex) sumOuter += B[i][j];
                else sumInner += B[i][j];
            }

        if (sumInner > sumOuter) return "Inner";
        else if (sumOuter > sumInner) return "Outside";
        return "Tie";
    }
}
