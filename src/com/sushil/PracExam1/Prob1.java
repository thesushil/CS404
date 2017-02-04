package com.sushil.PracExam1;

public class Prob1 {
    public static int maxRec1(int[] A, int low, int high) {
        if (low == high) return A[low];
        int mid = (high + low) / 2;
        int max1 = maxRec1(A, low, mid);
        int max2 = maxRec1(A, mid + 1, high);
        if (max1 > max2) return max1;
        return max2;
    }

    public static int maxRec2(int[] A, int low, int high) {
        if (low == high) return A[low];
        int max = maxRec2(A, low+1, high);
        if (A[low] > max) return A[low];
        return max;
    }
}
