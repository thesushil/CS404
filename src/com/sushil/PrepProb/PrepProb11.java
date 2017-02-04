package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb11 {

    public static void test() {
        int[] A = {1,3,4,5,23};
        int[] B = {1,4,7,9,12,21,23};
        int result = howManyInCommon(A, B);
        System.out.println(result);
    }

    public static int howManyInCommon(int[] A, int[] B) {
        int aLen = A.length, bLen = B.length;
        int count = 0;
        for(int i = 0; i< aLen; i++) {
            for (int j = 0; j < bLen; j++) {
                if(A[i] == B[j]) count++;
            }
        }
        return count;
    }

}
