package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/18/2017.
 */
public class PrepProb14 {
    public static void test() {
        System.out.println(rangeProduct(1, 4));
        System.out.println(rangeProduct(200, 204));
        System.out.println(rangeProduct(-1, 4));
    }

    public static int rangeProduct(int a, int b) {
        int product = 1;
        for (int i = a; i <= b; i++) product *= i;
        return product;
    }
}
