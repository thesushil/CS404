package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb12 {
    public static void test() {
        int[] A = {1, 9, 40, 9, 9, 9, 3};
        System.out.println(firstValueThreeInARow(A));
    }

    public static int firstValueThreeInARow(int[] myArray) {
        int n = myArray.length;
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) {
                    if (++count == 3) return myArray[i];
                } else count = 1;
            }
        }
        return -1;
    }
}
