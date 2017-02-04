package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b: ");
        int b = in.nextInt();

        int pow = 1;
        for(int i = 1; i <= b; i++) pow*=a;

        System.out.printf("%d to the power %d is %d.",a,b,pow);
    }

}
