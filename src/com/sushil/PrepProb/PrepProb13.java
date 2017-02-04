package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/18/2017.
 */
public class PrepProb13 {
    public static void test() {
        int[] A = {1, 1, 1, 9, 90, 90, 0};
        System.out.println(indexOfFirstPair(A));
    }

    public static int indexOfFirstPair(int[] myArray) {
        int n = myArray.length;
        for (int i = 0; i < n - 1; i++) {
            if ((i == 0 || myArray[i] != myArray[i - 1])
                    && myArray[i] == myArray[i + 1]
                    && (i == n - 2 || myArray[i] != myArray[i + 2])) {
                return i;
            }
        }
        return -1;
    }
}
