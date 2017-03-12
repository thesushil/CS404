package com.sushil;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PracExam3BTest {
    @Test
    public void PrintWholePath() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        int[][] P;

        P = new int[][]{
                {0, 0},
                {0, 0}};
        outContent.reset();
        PracExam3B.PrintWholePath(1, 1, P);
        assertEquals("1\r\n", outContent.toString());

        P = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        outContent.reset();
        PracExam3B.PrintWholePath(1, 2, P);
        assertEquals("1 2\r\n", outContent.toString());

        P = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 3, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        outContent.reset();
        PracExam3B.PrintWholePath(1, 2, P);
        assertEquals("1 3 2\r\n", outContent.toString());

        P = new int[][]{
                {0, 0, 0, 0, 0},
                {0, 0, 0, 2, 0},
                {0, 0, 0, 4, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        outContent.reset();
        PracExam3B.PrintWholePath(1, 3, P);
        assertEquals("1 2 4 3\r\n", outContent.toString());

        P = new int[][]{
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 5, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 2, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        outContent.reset();
        PracExam3B.PrintWholePath(3, 4, P);
        assertEquals("3 2 1 5 4\r\n", outContent.toString());

    }

    @Test
    public void frequencyOfLargest() {
        int result;

        result = PracExam3B.frequencyOfLargest(0, new int[]{});
        assertEquals(0, result);

        result = PracExam3B.frequencyOfLargest(1, new int[]{2});
        assertEquals(1, result);

        result = PracExam3B.frequencyOfLargest(2, new int[]{2, 3});
        assertEquals(1, result);

        result = PracExam3B.frequencyOfLargest(2, new int[]{3, 3});
        assertEquals(2, result);

        result = PracExam3B.frequencyOfLargest(2, new int[]{1, 9, 5, 1, 9});
        assertEquals(1, result);

        result = PracExam3B.frequencyOfLargest(8, new int[]{1, 9, 5, 1, 9, 11, 11, 11});
        assertEquals(3, result);
    }

    @Test
    public void allOptimalPathsAreDirectEdges() {
        boolean result;
        int[][] W;

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 90, 60},
                {0, 15, 0, 20},
                {0, 50, 25, 0}};
        result = PracExam3B.allOptimalPathsAreDirectEdges(3, W);
        assertFalse(result);

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 90, 60},
                {0, 15, 0, 20},
                {0, 50, 40, 0}};
        result = PracExam3B.allOptimalPathsAreDirectEdges(3, W);
        assertTrue(result);
    }

    @Test
    public void A_is_subpath_of_B(){
        boolean result;
        int[] A,B;

        A = new int[]{5,2,7};
        B = new int[]{5,2,7};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertTrue(result);

        A = new int[]{5,2,7};
        B = new int[]{8,12,5,2,7,10};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertTrue(result);

        A = new int[]{5,2,7};
        B = new int[]{8, 5, 12, 10, 2, 7};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertFalse(result);

        A = new int[]{5,2,7};
        B = new int[]{8,12,7,5,2,10};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertFalse(result);

        A = new int[]{5,2,7, 9};
        B = new int[]{8, 12, 3, 10, 1, 5, 2, 7};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertFalse(result);

        A = new int[]{5,2,7, 9};
        B = new int[]{2, 7, 9, 8, 10};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertFalse(result);

        A = new int[]{8, 10, 4, 3, 6};
        B = new int[]{8, 10, 4, 3, 6, 12, 15, 1};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertTrue(result);

        A = new int[]{8, 10, 4, 3, 6};
        B = new int[]{5, 3, 1, 9, 10, 8, 10, 4, 3, 6};
        result = PracExam3B.A_is_subpath_of_B(A,B);
        assertTrue(result);
    }

}
