package com.sushil;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GraphColoringTest {
    @Before
    public void setup(){

        G1 = new boolean[][]{
                {false, false, false, false, false, false, false, false, false},
                {false, false, false, false, true, false, true, false, true},
                {false, false, false, true, false, true, false, true, false},
                {false, false, true, false, false, false, true, false, true},
                {false, true, false, false, false, true, false, true, false},
                {false, false, true, false, true, false, false, false, true},
                {false, true, false, true, false, false, false, true, false},
                {false, false, true, false, true, false, true, false, false},
                {false, true, false, true, false, true, false, false, false}};

        G2 = new boolean[][]{
                {false, false, false, false, false, false, false, false, false,false},
                {false, false, true, false, true, true, false, true, true, false},
                {false, true, false, false, false, true, true, false, false, true},
                {false, false, false, false, false, false, false, true, true, false},
                {false, true, false, false, false, false, false, true, true, true},
                {false, true, true, false, false, false, false, false, true, true},
                {false, false, true, false, false, false, false, false, false, true},
                {false, true, false, true, true, false, false, false, true, false},
                {false, true, false, true, true, true, false, true, false, true},
                {false, false, true, false, true, true, true, false, true, false}};
    }

    private  boolean[][] G1, G2;

    @Test
    public void greedyColoring() throws Exception {
        int m;
        int[] v;

        v = new int[G1.length];
        m = GraphColoring.greedyColoring(v.length - 1, G1, v);
        assertEquals(4, m);

        v = new int[G2.length];
        m = GraphColoring.greedyColoring(v.length - 1, G2, v);
        assertEquals(5, m);
    }
    @Test
    public void backtrackColoringNumSolution() throws Exception {
        int numSol;
        int[] v;

        v = new int[G1.length];
        numSol = GraphColoring.backtrackColoringNumSolution(v.length-1,2,G1);
        assertEquals(2,numSol);

        v = new int[G1.length];
        numSol = GraphColoring.backtrackColoringNumSolution(v.length-1,4,G2);
        assertEquals(576,numSol);
    }

    @Test
    public void backtrackColoring() throws Exception {
        int m;
        int[] v;

        v = new int[G1.length];
        m = GraphColoring.backtrackColoring(v.length-1, G1, v);
        assertEquals(2, m);

        v = new int[G1.length];
        m = GraphColoring.backtrackColoring(v.length-1, G2, v);
        assertEquals(4, m);
    }

    @Test
    public void backtrackColoringSolution() throws Exception {
    }

    @Test
    public void getForced3Coloring() throws Exception {
        boolean[][] G = new boolean[][]{
                {false,false,false,false,false,false,false,false,false},
                {false,true,true,false,true,false,false,true,false},
                {false,true,true,false,true,false,true,true,true},
                {false,false,false,true,true,true,false,false,false},
                {false,true,true,true,true,false,false,false,false},
                {false,false,false,true,false,true,true,false,true},
                {false,false,true,false,false,true,true,false,true},
                {false,true,true,false,false,false,false,true,true},
                {false,false,true,false,false,true,true,true,true}
        };
        int n = G.length -1;
        int[] vColor = new int[n + 1];
        vColor[1] = 1;
        vColor[2] = 2;

        vColor = GraphColoring.getForced3Coloring(n, vColor, G);
        assertArrayEquals(new int[]{0,1,2,1,3,2,3,3,1}, vColor);
    }

}