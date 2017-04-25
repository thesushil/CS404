package com.sushil;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    @Test
    public void oneWayStreets() throws Exception {
    }

    @Test
    public void stronglyConnected() throws Exception {
    }

    @Test
    public void largestInCommon() throws Exception {
        int[] A, B;
        int largestInCommon;

        A = new int[]{1, 4, 23, 12, 67};
        B = new int[]{0, 1, 4, 12, 13, 99};
        largestInCommon = PracExam4C.largestInCommon(A, B);
        assertEquals(12, largestInCommon);

        A = new int[]{1, 4, 23, 12, 67, 99};
        B = new int[]{0, 10, 14, 102, 13};
        largestInCommon = PracExam4C.largestInCommon(A, B);
        assertEquals(-1, largestInCommon);

        A = new int[]{1, 4, 23, 12, 67, 132, 99};
        B = new int[]{0, 1, 14, 102, 13};
        largestInCommon = PracExam4C.largestInCommon(A, B);
        assertEquals(1, largestInCommon);
    }

    @Test
    public void printPrimeFactorization() throws Exception {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        outContent.reset();
        PracExam4C.printPrimeFactorization(100);
        assertEquals("(2^2)(5^2)", outContent.toString());

        outContent.reset();
        PracExam4C.printPrimeFactorization(101);
        assertEquals("(101^1)", outContent.toString());

        outContent.reset();
        PracExam4C.printPrimeFactorization(101);
        assertEquals("(101^1)", outContent.toString());
    }

    @Test
    public void subString() throws Exception {
        boolean result;

        result = PracExam4C.subString("abc", "a");
        assertTrue(result);

        result = PracExam4C.subString("a", "abc");
        assertTrue(result);

        result = PracExam4C.subString("", "a");
        //assertTrue(result);

        result = PracExam4C.subString("a", "");
        //assertTrue(result);

        result = PracExam4C.subString("abc", "abc");
        assertTrue(result);

        result = PracExam4C.subString("abcd", "ade");
        assertFalse(result);

        result = PracExam4C.subString("abc", "adef");
        assertFalse(result);
    }

    @Test
    public void allEdgesUniqueWeights() throws Exception {
        boolean result;
        int[][] W;

        W = new int[][]{
                {0,0,0,0},
                {0,0,1,3},
                {0,2,0,4},
                {0,7,9,0}
        };
        result = PracExam4C.allEdgesUniqueWeights(W);
        assertTrue(result);

        W = new int[][]{
                {0,0,0,0},
                {0,0,1,1},
                {0,2,0,4},
                {0,7,9,0}
        };
        result = PracExam4C.allEdgesUniqueWeights(W);
        assertFalse(result);

        W = new int[][]{
                {0,0,0,0},
                {0,0,9,1},
                {0,2,0,4},
                {0,7,9,0}
        };
        result = PracExam4C.allEdgesUniqueWeights(W);
        assertFalse(result);

    }

}