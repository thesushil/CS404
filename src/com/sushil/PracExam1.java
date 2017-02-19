package com.sushil;

public class PracExam1 {

    // Problem 1
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

    // Problem 2
    public static int sum1(int[] A, int low, int high) {
        if (low == high) return A[high];
        int mid = (low + high) / 2;
        return sum1(A, low, mid) + sum1(A, mid + 1, high);
    }

    public static int sum2(int[] A, int low, int high) {
        if (low == high) return A[high];
        return A[low] + sum2(A, low + 1, high);
    }

    // Problem 3
    public static int loc(int[] A, int low, int high, int x) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (x == A[mid]) return mid;
        if (x > A[mid]) return loc(A, mid + 1, high, x);
        return loc(A, low, mid - 1, x);
    }

    // Problem 4
    public static boolean containsAZero(int[] A, int low, int high) {
        if (A[low] == 0) return true;
        if (low == high) return false;
        return containsAZero(A, low + 1, high);
    }

    // Problem 5
    public static int lastDigitOfProduct(int [] A, int low, int high) {
        if (low == high) return A[low]%10;
        return (A[low] * lastDigitOfProduct(A, low + 1, high))%10;
    }

    // Problem 6
    public static boolean oddSum(int[] A, int low, int high) {
        if (low == high) return A[low] % 2 == 1;
        return A[low] % 2 == 1 != oddSum(A, low + 1, high);
    }

    // Problem 7
    public static int sumOfDigits(int n) {
        if (n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }

    // Problem 8
    public static double average(double[] A, int low, int high) {
        if (low == high) return A[low];
        int mid = (low + high) / 2;
        double leftAvg = average(A, low, mid);
        double rightAvg = average(A, mid + 1, high);
        return (leftAvg + rightAvg) / 2;
    }

    public static double average2(double[] A, int low, int high) {
        if (low == high) return A[low];
        double avg = average2(A, low + 1, high);
        return (A[low] + (high - low) * avg) / (high - low + 1);
    }
}
