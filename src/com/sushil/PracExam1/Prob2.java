package com.sushil.PracExam1;

public class Prob2 {
    public static int sum1(int[] A, int low, int high) {
        if (low == high) return A[high];
        int mid = (low + high) / 2;
        return sum1(A, low, mid) + sum1(A, mid + 1, high);
    }

    public static int sum2(int[] A, int low, int high) {
        if (low == high) return A[high];
        return A[low] + sum2(A, low + 1, high);
    }
}
