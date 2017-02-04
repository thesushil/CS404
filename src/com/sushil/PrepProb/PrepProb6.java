package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb6 {
    public static void test() {
        int[] A = {1, 4, 7, 9, 2, 10, 3};
        System.out.println(allUnique(A));
    }

    public static boolean allUnique(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i] == A[j]) return false;
            }
        }
        return true;
    }

}
