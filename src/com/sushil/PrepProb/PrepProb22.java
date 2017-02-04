package com.sushil.PrepProb;

import static java.lang.Math.sqrt;

/**
 * Created by 212358644 on 1/21/2017.
 */
public class PrepProb22 {
    public static void test() {
        System.out.print(isSumOfTwoDistinctSquares(5));
    }

    public static boolean isSumOfTwoDistinctSquares(int n) {
        boolean isIt = false;
        int half = n / 2;
        for (int i = half; i >= 0; i--)
            for (int j = 0; j < half; j++) {
                if (n == i * i + j * j) return true;
            }
        return isIt;
    }
}
