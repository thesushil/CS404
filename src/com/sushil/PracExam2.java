package com.sushil;

public class PracExam2 {

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
    public static String alternating(int[]A, int low, int high){
        return "NEITHER";
    }

}
