package com.sushil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PracExam2ATest {

    @Test
    void indexOfMinimumRec() {

    }

    @Test
    void sortRec() {

    }

    @Test
    void totalSumOfDigits() {

    }

    @Test
    void alternating() {
        int[] A = {0, 19, 52, 34, 95, 22, 22, 66, 77};
        String alt;

        alt = PracExam2A.alternating(A, 1, 5);
        assertEquals("UPfirst", alt);

        alt = PracExam2A.alternating(A, 2, 5);
        assertEquals("DOWNfirst", alt);

        alt = PracExam2A.alternating(A, 5, 7);
        assertEquals("NEITHER", alt);

        alt = PracExam2A.alternating(A, 6, 8);
        assertEquals("NEITHER", alt);
    }

    @Test
    void alternates() {
        boolean res;

        int[] A1 = {0, 5, 7, 3, 11, 9, 25};
        res = PracExam2A.alternates(A1.length - 1, A1);
        assertTrue(res);

        int[] A2 = {0, 35, 9, 33, 11, 49};
        res = PracExam2A.alternates(A2.length - 1, A2);
        assertTrue(res);

        int[] A3 = {0, 50, 70, 90, 11, 20, 25};
        res = PracExam2A.alternates(A3.length - 1, A3);
        assertFalse(res);

        int[] A4 = {0, 50, 70, 50, 30, 11};
        res = PracExam2A.alternates(A4.length - 1, A4);
        assertFalse(res);

        int[] A5 = {0, 50, 70, 70, 30};
        res = PracExam2A.alternates(A5.length - 1, A5);
        assertFalse(res);
    }

}