package com.sushil.PrepProb;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by 212358644 on 1/18/2017.
 */
public class PrepProb15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> distinctOnes = new ArrayList<>();

        int previous = -1;
        while (true) {
            System.out.print("Enter an int: ");
            int a = in.nextInt();
            if (a == previous) break;
            addIfNew(distinctOnes, a);
            previous = a;
        }

        int n = distinctOnes.size();
        System.out.printf("You entered %d %s.", n, (n > 1 ? "values" : "value"));
    }

    private static void addIfNew(ArrayList<Integer> myArray, int a) {
        int n = myArray.size();
        for (int i = 0; i < n; i++)
            if (myArray.get(i).equals(a)) return;

        myArray.add(a);
    }

}
