package com.sushil.PrepProb;

/**
 * Created by 212358644 on 1/21/2017.
 */
public class PrepProb21 {
    public static void test() {
        //int[] myArray = {3,8,17,25,89,95};
        //int[] myArray = {77,66,55,33,22,11};
        //int[] myArray = {20,30,50,40,10,5};
        int[] myArray = {20, 30, 50, 50, 70, 90};
        System.out.print(goingWhichWay(myArray));
    }

    public static int goingWhichWay(int[] myArray) {
        int order = 333;
        if (myArray[0] < myArray[1]) order = 111;
        else if (myArray[0] > myArray[1]) order = 222;
        else {
            System.out.print("NEITHER");
            return 333;
        }

        int n = myArray.length;
        for (int i = 2; i < n; i++) {
            if (order == 111 && myArray[i] <= myArray[i - 1]) {
                order = 333;
                break;
            } else if (order == 222 && myArray[i] >= myArray[i - 1]) {
                order = 333;
                break;
            }
        }

        if (order == 111) System.out.print("UP");
        else if (order == 222) System.out.print("DOWN");
        else System.out.print("NEITHER");

        return order;
    }
}
