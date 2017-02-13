package com.sushil.PracExam1;

public class Prob5 {
    public static int lastDigitOfProduct(int [] A, int low, int high) {
        if (low == high) return A[low]%10;
        return (A[low] * lastDigitOfProduct(A, low + 1, high))%10;
    }
}
