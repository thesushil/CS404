package com.sushil;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracProbTest {

    @Test
    public void printOrderings() throws Exception {
        PracProb.printOrderings(4);
    }

    @Test
    public void hasPairThatSumsToTarget() throws Exception {
        int[] A;
        boolean result;

        A = new int[]{7,15,18,30,56,75,80,90};
        result = PracProb.hasPairThatSumsToTarget(A, 98);
        assertTrue(result);
        result = PracProb.hasPairThatSumsToTarget(A, 48);
        assertTrue(result);
        result = PracProb.hasPairThatSumsToTarget(A, 90);
        assertTrue(result);
        result = PracProb.hasPairThatSumsToTarget(A, 100);
        assertFalse(result);
        result = PracProb.hasPairThatSumsToTarget(A, 1000);
        assertFalse(result);
    }

    @Test
    public void addOne() throws Exception {
        int[] A;
        boolean flag;

        A = new int[]{1, 0, 1};
        flag = PracProb.addOne(A);
        assertArrayEquals(new int[]{1, 1, 0}, A);
        assertTrue(flag);

        A = new int[]{0,0,1,0,0,1,1,1};
        flag = PracProb.addOne(A);
        assertArrayEquals(new int[]{0,0,1,0,1,0,0,0}, A);
        assertTrue(flag);

        A = new int[]{1,1,1,1,1,1};
        flag = PracProb.addOne(A);
        assertArrayEquals(new int[]{0,0,0,0,0,0}, A);
        assertFalse(flag);
    }
    
    @Test
    public void enoughEdgesForSpanningTree() throws Exception {

        int[][] G = new int[][]{
                {0,1,2,3,4,5,6,7,8},
                {0,0,2,9,2,9,9,2,2},
                {0,2,0,9,2,9,2,2,9},
                {0,9,9,0,2,2,9,9,9},
                {0,2,2,2,0,9,9,9,9},
                {0,9,9,2,9,0,2,9,2},
                {0,9,2,9,9,2,0,9,2},
                {0,2,2,9,9,9,9,0,2},
                {0,9,2,9,9,2,2,2,0}
        };

        PracProb.enoughEdgesForSpanningTree(G);
    }

}