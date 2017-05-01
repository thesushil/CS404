package com.sushil;

import org.junit.Test;

public class QueensTest {
    @Test
    public void blockCounter() throws Exception {
        Queens.blockCounter(4);
    }
    @Test
    public void nQueens() throws Exception {
        Queens.nQueens(5);
    }

}