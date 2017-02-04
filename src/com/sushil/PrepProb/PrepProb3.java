package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/16/2017.
 */
public class PrepProb3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] last3 = new int[3];
        int i = 0;
        while (true) {
            System.out.print("Enter an integer: ");
            last3[i++] = in.nextInt();
            if (i == 3) i = 0;
            if (last3[0] == last3[1] && last3[1] == last3[2]) break;
        }
        System.out.print("Same entered 3 in a row.");
    }
}
