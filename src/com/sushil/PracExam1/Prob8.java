package com.sushil.PracExam1;

public class Prob8 {
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
