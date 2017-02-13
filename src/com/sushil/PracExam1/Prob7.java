package com.sushil.PracExam1;

public class Prob7 {
    public static int sumOfDigits(int n) {
        if (n < 10) return n;
        return n % 10 + sumOfDigits(n / 10);
    }
}
