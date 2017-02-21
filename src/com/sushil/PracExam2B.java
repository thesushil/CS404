package com.sushil;

public class PracExam2B {
    // Problem 1 - tracing of a given code, no new code

    // Problem 2
    public static void TOH(int n, String start, String end, String spare) {
        if (n == 1) {
            System.out.printf("Move disc 1 from peg %s to peg %s\n", start, end);
            return;
        }
        TOH(n - 1, start, spare, end);
        System.out.printf("Move disc %d from peg %s to peg %s\n",n, start, end);
        TOH(n - 1, spare, end, start);
    }

    // Problem 3
    public static int numWays(int amt, int k, int[] D) {
        if (amt < 0 || k <= 0) return 0;
        if (amt == 0) return 1;

        return numWays(amt - D[k], k, D) + numWays(amt, k - 1, D);
    }


}
