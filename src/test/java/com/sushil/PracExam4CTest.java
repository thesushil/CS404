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

    @Test
    public void numComponents() throws Exception {
        int[][] W;
        int num, INF = PracExam4C.INFINITE;

        W = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 10, 15, INF, INF, 12},
                {0, 10, 0, 20, INF, 13, 9},
                {0, 15, 20, 0, 18, 8, INF},
                {0, INF, INF, 18, 0, INF, 10},
                {0, INF, 13, 8, INF, 0, 8},
                {0, 12, 9, INF, 10, 8, 0}
        };
        num = PracExam4C.numComponents(W);
        assertEquals(1,num);

        W = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, INF, INF, INF},
                {0, INF, 0, INF, INF},
                {0, INF, INF, 0, INF},
                {0, INF, INF, INF, 0}
        };
        num = PracExam4C.numComponents(W);
        assertEquals(4,num);

        W = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, INF, 2, INF},
                {0, INF, 0, INF, INF},
                {0, 2, INF, 0, INF},
                {0, INF, INF, INF, 0}
        };
        num = PracExam4C.numComponents(W);
        assertEquals(3,num);

        W = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, INF, 2, 5},
                {0, INF, 0, INF, INF},
                {0, 2, INF, 0, INF},
                {0, 5, INF, INF, 0}
        };
        num = PracExam4C.numComponents(W);
        assertEquals(2,num);
    }

}