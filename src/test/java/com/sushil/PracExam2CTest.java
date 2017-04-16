package com.sushil;

import org.junit.Test;
import static org.junit.Assert.*;

class PracExam2CTest {
    @Test
    void combin_Rec() {
        int res;

        res = PracExam2C.combin_Rec(0, 10);
        assertEquals(1, res);

        res = PracExam2C.combin_Rec(10, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_Rec(0, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_NonRec(3, 2);
        assertEquals(3, res);

        res = PracExam2C.combin_Rec(10, 5);
        assertEquals(252, res);

        res = PracExam2C.combin_Rec(50, 7);
        assertEquals(99884400, res);
    }

    @Test
    void combin_NonRec() {
        int res;

//        res = PracExam2C.combin_NonRec(0, 10);
//        assertEquals(1, res);

        res = PracExam2C.combin_NonRec(10, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_NonRec(0, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_NonRec(3, 2);
        assertEquals(3, res);

        res = PracExam2C.combin_NonRec(10, 5);
        assertEquals(252, res);

        res = PracExam2C.combin_NonRec(50, 7);
        assertEquals(99884400, res);
    }

    @Test
    void combin_NonRecBetter() {
        int res;

//        res = PracExam2C.combin_NonRecBetter(0, 10);
//        assertEquals(1, res);

        res = PracExam2C.combin_NonRecBetter(10, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_NonRecBetter(0, 0);
        assertEquals(1, res);

        res = PracExam2C.combin_NonRec(3, 2);
        assertEquals(3, res);

        res = PracExam2C.combin_NonRecBetter(10, 5);
        assertEquals(252, res);

        res = PracExam2C.combin_NonRecBetter(50, 7);
        assertEquals(99884400, res);
    }

    @Test
    void numWays_NonRec() {
        int ways;

        ways = PracExam2C.numWays_NonRec(0, 0, new int[]{0});
        assertEquals(0, ways);

        ways = PracExam2C.numWays_NonRec(0, 3, new int[]{0, 1, 5, 25});
        assertEquals(1, ways);

        ways = PracExam2C.numWays_NonRec(32, 3, new int[]{0, 1, 5, 25});
        assertEquals(9, ways);

        ways = PracExam2C.numWays_NonRec(4, 3, new int[]{0, 1, 2, 3});
        assertEquals(4, ways);

        ways = PracExam2C.numWays_NonRec(5, 3, new int[]{0, 1, 2, 3});
        assertEquals(5, ways);

        ways = PracExam2C.numWays_NonRec(10, 4, new int[]{0, 2, 5, 3, 6});
        assertEquals(5, ways);
    }

    @Test
    void two_to_n_Rec() {
        int res;
        res = PracExam2C.two_to_n_Rec(1);
        assertEquals(2, res);
        res = PracExam2C.two_to_n_Rec(2);
        assertEquals(4, res);
        res = PracExam2C.two_to_n_Rec(3);
        assertEquals(8, res);
        res = PracExam2C.two_to_n_Rec(4);
        assertEquals(16, res);
        res = PracExam2C.two_to_n_Rec(10);
        assertEquals(1024, res);
        res = PracExam2C.two_to_n_Rec(20);
        assertEquals(1024*1024, res);
    }

    @Test
    void two_to_n_Dyn() {
        int res;
        res = PracExam2C.two_to_n_Dyn(1);
        assertEquals(2, res);
        res = PracExam2C.two_to_n_Dyn(2);
        assertEquals(4, res);
        res = PracExam2C.two_to_n_Dyn(3);
        assertEquals(8, res);
        res = PracExam2C.two_to_n_Dyn(4);
        assertEquals(16, res);
        res = PracExam2C.two_to_n_Dyn(10);
        assertEquals(1024, res);
        res = PracExam2C.two_to_n_Dyn(20);
        assertEquals(1024*1024, res);
    }

    @Test
    void trib() {
        int res;

        res = PracExam2C.trib(1);
        assertEquals(1, res);

        res = PracExam2C.trib(2);
        assertEquals(2, res);

        res = PracExam2C.trib(3);
        assertEquals(4, res);

        res = PracExam2C.trib(4);
        assertEquals(7, res);

        res = PracExam2C.trib(5);
        assertEquals(13, res);

        res = PracExam2C.trib(6);
        assertEquals(24, res);

        res = PracExam2C.trib(7);
        assertEquals(44, res);

        res = PracExam2C.trib(8);
        assertEquals(81, res);
    }

}