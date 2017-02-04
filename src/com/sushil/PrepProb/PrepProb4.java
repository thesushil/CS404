package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/16/2017.
 */
public class PrepProb4 {

    public static void test() {
        int[] A = {1,3,4,3};
        int[] B = {1,4,1,9,2,1,3};
        boolean result = appearsConsecutively(A, B);
        System.out.println(result);
    }

    public static boolean appearsConsecutively(int[] A, int[] B) {
        int lengthA = A.length;
        int lengthB = B.length;
        for (int i = 0; i < lengthB; i++) {
            if (B[i] != A[0]) continue;
            int j = 1;
            for (; j < lengthA; j++) if ((i + j) >= lengthB || B[i + j] != A[j]) break;
            if (j == lengthA) return true;
        }
        return false;
    }
}
