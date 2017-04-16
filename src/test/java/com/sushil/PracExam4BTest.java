package com.sushil;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PracExam4BTest {
    @Test
    public void vertexWithHighestTotalWeight() throws Exception {
        int result;
        int[][] W;

        W = new int[][]{{0, 0, 0, 0, 0},
                {0, 0, 70, 60, 30},
                {0, 20, 0, 10, 40},
                {0, 60, 50, 0, 40},
                {0, 30, 40, 60, 0}};
        result = PracExam4B.vertexWithHighestTotalWeight(W);
        assertEquals(3, result);
    }

    @Test
    public void greedySolution() throws Exception {
        int[] sol, D;

        D = new int[]{0, 53, 10, 4};
        sol = PracExam4B.greedySolution(81, 3, D);
        assertArrayEquals(sol, new int[]{0, 1, 2, 2});
        sol = PracExam4B.greedySolution(86, 3, D);
        assertEquals(-1, sol[1]);
    }

    @Test
    public void minSpanTreeCost_or_numUnreachable() throws Exception {
        int result = 0;
        int[][] W;

        W = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 9999, 9999, 9999, 60},
                {0, 9999, 0, 40, 50, 30},
                {0, 9999, 40, 0, 20, 9999},
                {0, 9999, 50, 20, 0, 9999},
                {0, 60, 30, 9999, 9999, 0}};
        result = PracExam4B.minSpanTreeCost_or_numUnreachable(W);
        assertEquals(150, result);

        W = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 9999, 9999, 9999, 60},
                {0, 9999, 0, 40, 50, 9999},
                {0, 9999, 40, 0, 20, 9999},
                {0, 9999, 50, 20, 0, 9999},
                {0, 60, 9999, 9999, 9999, 0}};
        result = PracExam4B.minSpanTreeCost_or_numUnreachable(W);
        assertEquals(-3, result);
    }

    @Test
    public void nonRecDijkstraPrintPath() throws Exception{
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        outContent.reset();
        PracExam4B.nonRecDijkstraPrintPath(1,3, new int[]{0,1,1,4,2});
        assertEquals("1243", outContent.toString());

        outContent.reset();
        PracExam4B.nonRecDijkstraPrintPath(2,1, new int[]{0,3,2,4,2});
        assertEquals("2431", outContent.toString());
    }
}