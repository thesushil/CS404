package com.sushil.PracExam1;

public class Recursive1 {
    public static boolean containsAZero(int [] A, int low, int high) {
        if (low > high)
            return false;
        else
        {
            int m = (low + high)/2;
            return containsAZero(A, low, m) || containsAZero(A, m+1, high);
        }
    }
}
