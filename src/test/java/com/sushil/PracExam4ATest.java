package com.sushil;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

public class PracExam4ATest {
    @Test
    public void dijkstra() throws Exception {
        int[][] W;
        int[] touch;

        W = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 10, 7, 5, 999, 17, 999, 999},
                {0, 10, 0, 14, 4, 2, 999, 9, 4},
                {0, 9, 14, 0, 7, 999, 999, 999, 999},
                {0, 999, 4, 7, 0, 999, 5, 8, 999},
                {0, 999, 3, 999, 15, 0, 6, 999, 10},
                {0, 17, 999, 999, 2, 6, 0, 999, 999},
                {0, 999, 11, 999, 8, 999, 999, 0, 4},
                {0, 999, 12, 999, 7, 999, 8, 4, 0}
        };

        touch = new int[W.length];
        PracExam4A.dijkstra(W, touch, 7);
        assertArrayEquals(new int[]{0, 2, 7, 4, 7, 2, 8, 7, 7}, touch);

        touch = new int[W.length];
        PracExam4A.dijkstra(W, touch, 6);
        assertArrayEquals(new int[]{0, 2, 4, 4, 6, 6, 6, 4, 2}, touch);
    }

    @Test
    public void printPath() throws Exception {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        outContent.reset();
        PracExam4A.printPath(1, 3, new int[]{0, 1, 1, 4, 2});
        assertEquals("1 2 4 3 ", outContent.toString());

        outContent.reset();
        PracExam4A.printPath(2, 1, new int[]{0, 3, 2, 4, 2});
        assertEquals("2 4 3 1 ", outContent.toString());
    }

    @Test
    public void dijkstra2() throws Exception {
        int[][] W;
        int[] touch, distance;

        W = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 10, 7, 5, 999, 17, 999, 999},
                {0, 10, 0, 14, 4, 2, 999, 9, 4},
                {0, 9, 14, 0, 7, 999, 999, 999, 999},
                {0, 999, 4, 7, 0, 999, 5, 8, 999},
                {0, 999, 3, 999, 15, 0, 6, 999, 10},
                {0, 17, 999, 999, 2, 6, 0, 999, 999},
                {0, 999, 11, 999, 8, 999, 999, 0, 4},
                {0, 999, 12, 999, 7, 999, 8, 4, 0}
        };

        touch = new int[W.length];
        distance = new int[W.length];
        PracExam4A.dijkstra2(W, touch, distance, 7);
        assertArrayEquals(new int[]{0, 2, 7, 4, 7, 2, 8, 7, 7}, touch);
        assertArrayEquals(new int[]{0, 21, 11, 15, 8, 13, 12, 0, 4}, distance);

        touch = new int[W.length];
        distance = new int[W.length];
        PracExam4A.dijkstra2(W, touch, distance, 6);
        assertArrayEquals(new int[]{0, 2, 4, 4, 6, 6, 6, 4, 2}, touch);
        assertArrayEquals(new int[]{0, 16, 6, 9, 2, 6, 0, 10, 10}, distance);
    }

    @Test
    public void hasCycle() throws Exception {

    }

    @Test
    public void prim() throws Exception {
        int[][] W;
        int[] nearest;

        W = new int[][]{
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 10, 15, 999, 999, 12},
                {0, 10, 0, 20, 999, 13, 9},
                {0, 15, 20, 0, 18, 8, 999},
                {0, 999, 999, 18, 0, 999, 10},
                {0, 999, 13, 8, 999, 0, 8},
                {0, 12, 9, 999, 10, 8, 0}
        };

        nearest = new int[W.length];
        PracExam4A.prim(W, nearest, 1);
        assertArrayEquals(new int[]{0, 1, 1, 5, 6, 6, 2}, nearest);

        nearest = new int[W.length];
        PracExam4A.prim(W, nearest, 4);
        assertArrayEquals(new int[]{0, 2, 6, 5, 4, 6, 4}, nearest);
    }

    @Test
    public void printMinSpanTree() throws Exception {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        outContent.reset();
        PracExam4A.printMinSpanTree(new int[]{0, 1, 1, 5, 6, 6, 2});
        assertEquals("(1,2) (5,3) (6,4) (6,5) (2,6) ", outContent.toString());

        outContent.reset();
        PracExam4A.printMinSpanTree(new int[]{0, 2, 6, 5, 4, 6, 4});
        assertEquals("(2,1) (6,2) (5,3) (6,5) (4,6) ", outContent.toString());
    }

}