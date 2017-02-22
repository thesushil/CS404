package com.sushil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by 212358644 on 2/22/2017.
 */
class PracExam2CTest {
    @Test
    void combin_Rec() {

    }

    @Test
    void combin_NonRec() {

    }

    @Test
    void combin_NonRecBetter() {

    }

    @Test
    void numWays_NonRec() {

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

    }

}