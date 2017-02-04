package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/16/2017.
 */
public class PrepProb2 {

    public static void test() {
        int[] freq = new int[] {3, 1, 5, 2};
        char[] text = new char[] {'m','s', 'k', 'p'};
        System.out.println(repeatChars(freq, text));
    }

    public static char[] repeatChars(int[] freq, char[] text) {
        char[] repeatedText = new char[sumOfElements(freq)];
        int textIndex = 0;
        int length = freq.length;
        for (int i = 0; i < length; i++) {
            for (int n = 0; n < freq[i]; n++) repeatedText[textIndex++] = text[i];
        }
        return repeatedText;
    }

    public static int sumOfElements(int[] A){
        int length = A.length;
        int sum = 0;
        for(int i =0; i<length; i++) sum+= A[i];
        return sum;
    }

}
