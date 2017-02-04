package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/21/2017.
 */
public class PrepProb17 {

    public static void test() {
        howManyEnteredBeforeSeenBoth(25,17);
    }

    public static void howManyEnteredBeforeSeenBoth(int a, int b){
        Scanner in = new Scanner(System.in);
        int count = 0;
        boolean aWait = true, bWait = true;
        while(aWait || bWait) {
            System.out.print("Enter an integer: ");
            int num = in.nextInt();
            if(num == a) aWait = false;
            else if(num == b) bWait = false;
            count++;
        }
        String formatStr = "You had to enter %d integers\nbefore typing both %d and %d.";
        System.out.printf(formatStr, count, a, b);
    }
}
