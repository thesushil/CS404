package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/21/2017.
 */
public class PrepProb18 {
    public static void test() {
        int[] myArray = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
        int value = mostFrequentValue(myArray);
        System.out.println(value);
    }

    public static int mostFrequentValue(int[] myArray) {
        int n = myArray.length;
        int highestFrequency = 1;
        int mostFrequent = myArray[0];
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (myArray[i] == myArray[j]) count++;
            }
            if(count > highestFrequency) {
                highestFrequency = count;
                mostFrequent = myArray[i];
            }
        }
        return mostFrequent;
    }
}
