package com.sushil;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class PracExam2BTest {
    @Test
    void TOH() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        PracExam2B.TOH(1,"Start","End", "Spare");
        assertEquals("Move disc 1 from peg Start to peg End\n", outContent.toString());
    }

    @Test
    void numWays() {
        int ways;

        ways = PracExam2B.numWays(0, 0, new int[]{0});
        assertEquals(0, ways);

        ways = PracExam2B.numWays(0, 3, new int[]{0, 1, 5, 25});
        assertEquals(1, ways);

        ways = PracExam2B.numWays(32, 3, new int[]{0, 1, 5, 25});
        assertEquals(9, ways);

        ways = PracExam2B.numWays(4, 3, new int[]{0, 1, 2, 3});
        assertEquals(4, ways);

        ways = PracExam2B.numWays(5, 3, new int[]{0, 1, 2, 3});
        assertEquals(5, ways);

        ways = PracExam2B.numWays(10, 4, new int[]{0, 2, 5, 3, 6});
        assertEquals(5, ways);
    }

    @Test
    void numWaysLtd() {
        int ways;

        System.out.println("amt:0");
        ways = PracExam2B.numWaysLtd(0,1,3,23);
        assertEquals(1, ways);

        System.out.println("amt:1");
        ways = PracExam2B.numWaysLtd(1,1,3,23);
        assertEquals(1, ways);

        System.out.println("amt:32");
        ways = PracExam2B.numWaysLtd(32,1,3,23);
        assertEquals(4, ways);
    }

    @Test
    void merge(){
        PracExam2B.merge(new int[]{67,43,1,9,14,21,7,8,11,22,34,23},2,5,9);
    }

    @Test
    void mergeSort(){
        PracExam2B.mergeSort(new int[]{24,3,99,55,17,11,45,9},0,7);
    }

    @Test
    void partition(){
        PracExam2B.partition(new int[]{24,3,99,55,5,11,45,9},0,7);
    }

    @Test
    void quickSort(){
        PracExam2B.quickSort(new int[]{24,3,99,55,5,11,45,9},0,7);
    }
}