package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/22/2017.
 */
public class PrepProb23 {
    public static void test() {
        System.out.print(glaciered(80, 20));
    }

    public static int glaciered(int k, int m) {
        int divisor, dividend;
        if (k == m) return k;
        if (k < m) {
            divisor = k;
            dividend = m;
        } else {
            divisor = m;
            dividend = k;
        }

        int remainder;
        do {
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }while (remainder > 0);
        return dividend;
    }

}
