package com.sushil;

public class PracExam2C {
    // Problem 1
    public static int combin_Rec(int n, int k) {
        return 1;
    }

    // Problem 2
    public static int combin_NonRec(int n, int k) {return 1;}

    // Problem 3
    public static int combin_NonRecBetter(int n, int k) {return 1;}

    // Problem 4
    public static int numWays_NonRec(int amt, int k, int [] D) {return 1;}

    // Problem 5
    public static int two_to_n_Rec(int n) {
        if (n == 1) return 2; System.out.println(5555555);
        return two_to_n_Rec(n - 1) + two_to_n_Rec(n - 1);
    }

    // Problem 6
    public static int two_to_n_Dyn(int n) {
        int[] pow = new int[n+1];
        pow[0] = 1;
        for (int i = 1; i <= n; i++) pow[i] = pow[i-1] + pow[i-1];
        return pow[n];
    }

    // Problem 7
    public static int trib(int n) {return 1;}
}
