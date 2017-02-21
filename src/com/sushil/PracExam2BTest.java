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
        ways = PracExam2B.numWays(32, 3, new int[]{0, 1, 5, 25});
        assertEquals(9, ways);
    }

}