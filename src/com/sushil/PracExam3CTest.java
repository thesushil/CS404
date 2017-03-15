package com.sushil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracExam3CTest {

    @Test
    public void howManyOptimalPathsAreDirectEdges() {
        int result;
        int[][] W;

        W = new int[][]{
                {0, 0, 0},
                {0, 0, 4},
                {0, 2, 0}
        };
        result = PracExam3C.howManyOptimalPathsAreDirectEdges(W.length - 1, W);
        assertEquals(2, result);

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, 4, 2},
                {0, 1, 0, 2},
                {0, 2, 1, 0}
        };
        result = PracExam3C.howManyOptimalPathsAreDirectEdges(W.length - 1, W);
        assertEquals(5, result);
    }

    @Test
    public void indexOfVertexWithMaxNumberOfOutgoingEdges() {
        int result;
        int[][] W;

        W = new int[][]{
                {0, 0, 0, 0},
                {0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE,},
                {0, 10, 0, Integer.MAX_VALUE,},
                {0, 51, 90, 0}
        };
        result = PracExam3C.indexOfVertexWithMaxNumberOfOutgoingEdges(W.length - 1, W);
        assertEquals(3, result);
    }

    @Test
    public void indexOfVertexMostUsedAsStopover() {
        int result;
        int[][] P;

        P = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 4, 5, 0, 0, 8, 9, 0, 5},
                {0, 7, 0, 0, 8, 7, 8, 3, 0, 7},
                {0, 7, 7, 0, 7, 7, 8, 0, 7, 7},
                {0, 7, 0, 7, 0, 7, 8, 0, 2, 7},
                {0, 9, 9, 0, 9, 0, 9, 9, 9, 0},
                {0, 0, 8, 5, 1, 1, 0, 9, 0, 5},
                {0, 0, 4, 5, 1, 1, 8, 0, 1, 5},
                {0, 7, 0, 7, 0, 7, 0, 4, 0, 7},
                {0, 7, 7, 0, 7, 0, 8, 0, 7, 0}
        };
        result = PracExam3C.indexOfVertexMostUsedAsStopover(P);
        assertEquals(1, result);
    }
}
