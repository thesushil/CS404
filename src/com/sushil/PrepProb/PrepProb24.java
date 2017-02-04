package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/22/2017.
 */
public class PrepProb24 {
    public static void test() {
        System.out.print(isPrime(146783251));
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
