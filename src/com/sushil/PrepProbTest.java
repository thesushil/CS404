package com.sushil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrepProbTest {
    @Test
    void indexOfHighestRowSum() {
        int[][] A = new int[][]{
                {5, 10, 1, 5},
                {1, 2, 1, 15},
                {8, 7, 5, 3},
                {6, 1, 12, 1},
                {6, 1, 12, 11}
        };
        int m = PrepProb.indexOfHighestRowSum(A);
    }

    @Test
    void repeatChars() {
        int[] freq = new int[]{3, 1, 5, 2};
        char[] text = new char[]{'m', 's', 'k', 'p'};
        System.out.println(PrepProb.repeatChars(freq, text));
    }

    @Test
    void sumOfElements() {

    }

    @Test
    void appearsConsecutively() {
        int[] A = {1, 3, 4, 3};
        int[] B = {1, 4, 1, 9, 2, 1, 3};
        boolean result = PrepProb.appearsConsecutively(A, B);
        System.out.println(result);
    }

    @Test
    void hasRowWithAllValuesTheSame() {
        int[][] B = new int[][]{
                {1, 1, 2, 9, 11},
                {1, 1, 4, 10, 11},
                {5, 3, 2, 8, 6},
                {3, 4, 3, 2, 7},
                {5, 3, 2, 8, 6}
        };
        boolean result = PrepProb.hasRowWithAllValuesTheSame(B, B.length);
        System.out.println(result);
    }

    @Test
    void allUnique() {
        int[] A = {1, 4, 7, 9, 2, 10, 3};
        System.out.println(PrepProb.allUnique(A));
    }

    @Test
    void allUnique_2D() {
        int[][] B = {{1, 2}, {5, 4}};
        System.out.println(PrepProb.allUnique_2D(B));
    }

    @Test
    void hasTwoIdenticalRows() {
        int[][] B = {{1, 2, 1}, {1, 1, 1}, {1, 2, 2}};
        System.out.println(PrepProb.hasTwoIdenticalRows(B.length, B));
    }

    @Test
    void howManyInCommon() {
        int[] A = {1, 3, 4, 5, 23};
        int[] B = {1, 4, 7, 9, 12, 21, 23};
        int result = PrepProb.howManyInCommon(A, B);
        System.out.println(result);
    }

    @Test
    void firstValueThreeInARow() {
        int[] A = {1, 9, 40, 9, 9, 9, 3};
        System.out.println(PrepProb.firstValueThreeInARow(A));
    }

    @Test
    void indexOfFirstPair() {
        int[] A = {1, 1, 1, 9, 90, 90, 0};
        System.out.println(PrepProb.indexOfFirstPair(A));
    }

    @Test
    void rangeProduct() {
        System.out.println(PrepProb.rangeProduct(1, 4));
        System.out.println(PrepProb.rangeProduct(200, 204));
        System.out.println(PrepProb.rangeProduct(-1, 4));
    }

    @Test
    void howManyEnteredBeforeSeenBoth() {
        PrepProb.howManyEnteredBeforeSeenBoth(25, 17);
    }

    @Test
    void mostFrequentValue() {
        int[] myArray = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
        int value = PrepProb.mostFrequentValue(myArray);
        System.out.println(value);
    }

    @Test
    void longestRun() {
        int[] myArray = {81, 81, 39, 17, 39, 17, 17, 17, 81, 81, 39, 5, 39, 39};
        int value = PrepProb.longestRun(myArray);
        System.out.println(value);
    }

    @Test
    void goingWhichWay() {
        //int[] myArray = {3,8,17,25,89,95};
        //int[] myArray = {77,66,55,33,22,11};
        //int[] myArray = {20,30,50,40,10,5};
        int[] myArray = {20, 30, 50, 50, 70, 90};
        System.out.print(PrepProb.goingWhichWay(myArray));
    }

    @Test
    void isSumOfTwoDistinctSquares() {
        assertTrue(PrepProb.isSumOfTwoDistinctSquares(5));
        assertTrue(PrepProb.isSumOfTwoDistinctSquares(25));
        assertFalse(PrepProb.isSumOfTwoDistinctSquares(18));
    }

    @Test
    void glaciered() {
        System.out.print(PrepProb.glaciered(80, 20));
    }

    @Test
    void isPrime() {
        System.out.print(PrepProb.isPrime(146783251));
    }

    @Test
    void innerOrOuterOrTies() {
        int[][] B = {
                {10, 10, 0, 5},
                {1, 21, 6, 5},
                {0, 11, 30, 20},
                {1, 0, 1, 1}};
//        int[][] B = {
//                {10, 20, 10, 5, 5},
//                {30, 30, 30, 30, 30},
//                {20, 20, 40, 30, 10},
//                {5, 30, 30, 30, 20},
//                {10, 5, 50, 30, 40}};
        System.out.print(PrepProb.innerOrOuterOrTies(B.length, B));
    }

}