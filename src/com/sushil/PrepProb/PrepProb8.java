package com.sushil.PrepProb;

import java.util.Scanner;

/**
 * Created by 212358644 on 1/17/2017.
 */
public class PrepProb8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int m = in.nextInt();

        if(k<m) {
            for (int i = k; i <= m; i++) System.out.printf(" %d", i);
        }
        else {
            for (int i = k; i >= m; i--) System.out.printf(" %d", i);
        }
    }



}
