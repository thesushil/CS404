package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/18/2017.
 */
public class PrepProb16 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int amount = in.nextInt(), quarter, nickel, penny;
        quarter = amount/25;
        int a = amount%25;
        nickel = a/5;
        penny = a%5;

        String formatStr = "To make %d cents, you need:\n%d quarters\n%d nickels\n%d pennies.";
        System.out.printf(formatStr, amount, quarter, nickel, penny);
    }

}
