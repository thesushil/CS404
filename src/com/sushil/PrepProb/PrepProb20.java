package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/21/2017.
 */
public class PrepProb20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int currentVal = in.nextInt();
        int prevVal = currentVal, count = 1;
        while (true) {
            System.out.print("Enter an integer: ");
            currentVal = in.nextInt();
            count++;
            if (currentVal < prevVal) break;
            prevVal = currentVal;
        }

        String formatStr = "You entered %d integers.\nThe last one entered was %d\nand the one before that was %d.";
        System.out.printf(formatStr, count, currentVal, prevVal);
    }
}
