package com.sushil.PracExam1;

public class Prob3 {
    public static int loc(int[] A, int low, int high, int x) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (x == A[mid]) return mid;
        if (x > A[mid]) return loc(A, mid + 1, high, x);
        return loc(A, low, mid - 1, x);
    }
}
