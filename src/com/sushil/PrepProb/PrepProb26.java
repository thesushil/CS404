package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/22/2017.
 */
public class PrepProb26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0, sum = 0, num = 0;
        do {
            sum += num;
            System.out.print("Enter int: ");
            num = in.nextInt();
            count++;
        } while (sum != num || count == 1);

        System.out.printf("You entered %d ints.", count);
    }
}
