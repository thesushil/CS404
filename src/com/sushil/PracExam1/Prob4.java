package com.sushil.PracExam1;

public class Prob4 {
    public static boolean containsAZero(int[] A, int low, int high) {
        if (A[low] == 0) return true;
        if (low == high) return false;
        return containsAZero(A, low + 1, high);
    }
}
