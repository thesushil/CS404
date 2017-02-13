package com.sushil.PracExam1;

public class Prob6 {
    public static boolean oddSum(int[] A, int low, int high) {
        if (low == high) return A[low] % 2 == 1;
        return A[low] % 2 == 1 != oddSum(A, low + 1, high);
    }
}
