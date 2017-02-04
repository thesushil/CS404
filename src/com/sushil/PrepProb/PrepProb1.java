package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/16/2017.
 */
public class PrepProb1 {

    public static void test() {
        int[][] A = new int[][]{
                {5, 10, 1, 5},
                {1, 2, 1, 15},
                {8, 7, 5, 3},
                {6, 1, 12, 1},
                {6, 1, 12, 11}
        };
        int m = indexOfHighestRowSum(A);
    }

    public static int indexOfHighestRowSum(int[][] A) {
        int numRows = A.length;
        int numColumns = A[0].length;
        int sum, maxSum = 0, maxSumRow = 0;
        for (int i = 0; i < numRows; i++) {
            sum = 0;
            for (int j = 0; j < numColumns; j++) sum += A[i][j];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumRow = i;
            }
        }
        return maxSumRow;
    }

}
