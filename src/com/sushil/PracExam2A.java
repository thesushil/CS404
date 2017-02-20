package com.sushil;

import java.util.Objects;

public class PracExam2A {

    // Problem 1
    public static int indexOfMinimumRec(final int[] A, int low, int high) {
        if (low == high) return low;
        int minIndex = indexOfMinimumRec(A, low + 1, high);
        if (A[low] < A[minIndex]) return low;
        else return minIndex;
    }

    // Problem 2
    public static void sortRec(int[] A, int low, int high) {
        if (low == high) return;
        int minIndex = indexOfMinimumRec(A, low + 1, high);
        if (A[low] > A[minIndex]) {
            int temp = A[low];
            A[low] = A[minIndex];
            A[minIndex] = temp;
        }
        sortRec(A, low + 1, high);
    }

    // Problem 3
    public static int totalSumOfDigits(int n) {
        if (n < 10) return n;
        int sum = (n % 10) + totalSumOfDigits(n / 10);
        if (sum < 10) return sum;
        return totalSumOfDigits(sum);
    }

    // Problem 4
    public static String alternating(int[] A, int low, int high) {
        if (low + 1 >= high) return "END";

        String alt;
        if (A[low] < A[low + 1]) alt = "UPfirst";
        else if (A[low] > A[low + 1]) alt = "DOWNfirst";
        else return "NEITHER";

        String allOthers = alternating(A, low + 1, high);
        if (!allOthers.equals(alt) && !allOthers.equals("END")) return alt;

        return "NEITHER";
    }

    // Problem 5
    public static boolean alternates(final int n, int [] A) {
        if (n <= 2) return false;

        if(A[1] == A[2]) return false;
        boolean direction = (A[1] < A[2]);
        for (int i = 3; i <= n; i++) {
            if(A[i-1] == A[i]) return false;
            boolean newDirection = (A[i - 1] < A[i]);
            if (direction == newDirection) return false;
            direction = newDirection;
        }
        return true;
    }

}
