package com.sushil;

import org.junit.Test;

import static org.junit.Assert.*;

public class PracExam4CTest {
    @Test
    public void bruteForceOptimal() throws Exception {
        assertArrayEquals(new int[]{2,0,0}, PracExam4C.bruteForceOptimal(10, 5, 2, 1));
        assertArrayEquals(new int[]{2,1,1}, PracExam4C.bruteForceOptimal(13, 5, 2, 1));
        assertArrayEquals(new int[]{1,7,1}, PracExam4C.bruteForceOptimal(123, 25, 13, 7));
    }

}