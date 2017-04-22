package com.sushil;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracExam4CTest {

    @Test
    public void bruteForceOptimal() throws Exception {
        assertArrayEquals(new int[]{2, 0, 0}, PracExam4C.bruteForceOptimal(10, 5, 2, 1));
        assertArrayEquals(new int[]{2, 1, 1}, PracExam4C.bruteForceOptimal(13, 5, 2, 1));
        assertArrayEquals(new int[]{1, 7, 1}, PracExam4C.bruteForceOptimal(123, 25, 13, 7));
    }

    @Test
    public void hasStar() throws Exception {
        int INF = PracExam4C.INFINITE;
        int[][] W;

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 3, 4},
                {0, 4, 0, 6},
                {0, 4, 6, 0}};
        assertTrue(PracExam4C.hasStar(W));

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 3, 4},
                {0, INF, 0, 6},
                {0, 4, 6, 0}};
        assertTrue(PracExam4C.hasStar(W));

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 3, INF},
                {0, INF, 0, 6},
                {0, 4, 6, 0}};
        assertTrue(PracExam4C.hasStar(W));

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 3, INF},
                {0, INF, 0, 6},
                {0, 4, INF, 0}};
        assertFalse(PracExam4C.hasStar(W));
    }

    @Test
    public void primConnected() throws Exception{
        boolean[][] W;

        W = new boolean[][]{
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, true},
                {false, false, true, true}};
        assertTrue(PracExam4C.primConnected(W));

        W = new boolean[][]{
                {false, false, false, false},
                {false, true, true, false},
                {false, true, true, false},
                {false, false, false, true}};
        assertFalse(PracExam4C.primConnected(W));

        W = new boolean[][]{
                {false, false, false, false,false},
                {false, true, true, false,true},
                {false, true, true, false,false},
                {false, false, false, true,true},
                {false, true, false, true, true}};
        assertTrue(PracExam4C.primConnected(W));

        W = new boolean[][]{
                {false, false, false, false,false},
                {false, true, true, false,true},
                {false, true, true, false,false},
                {false, false, false, true,false},
                {false, true, false, false, true}};
        assertFalse(PracExam4C.primConnected(W));
    }

}