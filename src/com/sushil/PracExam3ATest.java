package com.sushil;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PracExam3ATest {
    private int[][] W,P;

    @Before
    public void setup(){

    }

    @Test
    public void isWeightedGraph() {
        int n;
        int[][] B;
        boolean result;

        n = 1;
        B = new int[][]{
                {0, 0},
                {0, 1}};
        result = PracExam3A.isWeightedGraph(n, B);
        assertFalse(result);

        n = 4;
        B = new int[][]{ // row 0 and column 0 are not used
                {0, 0, 0, 0, 0},
                {0, 0, 1, 7, 2},
                {0, 4, 0, 2, 3},
                {0, 5, 3, 0, 8},
                {0, 1, 6, 2, 0}};
        result = PracExam3A.isWeightedGraph(n, B);
        assertTrue(result);

        n = 4;
        B = new int[][]{ // row 0 and column 0 are not used
                {0, 0, 0, 0, 0},
                {0, 0, 1, 7, 2},
                {0, 4, 0, 2, 3},
                {0, 5, 3, 0, 8},
                {0, 1, 6, 2, 2}};
        result = PracExam3A.isWeightedGraph(n, B);
        assertFalse(result);

        n = 4;
        B = new int[][]{ // row 0 and column 0 are not used
                {0, 0, 0, 0, 0},
                {0, 0, 1, 7, 2},
                {0, 4, 0, 2, 0},
                {0, 5, 3, 0, 8},
                {0, 1, 6, 2, 0}};
        result = PracExam3A.isWeightedGraph(n, B);
        assertFalse(result);
    }

    @Test
    public void Floyd(){}

    @Test
    public void printPath(){}
}
