package com.sushil;

import org.junit.Test;
import static org.junit.Assert.*;

public class PracExam3DTest {

    @Test
    public void opt_alignment(){
        int result;

        result = PracExam3D.opt_alignment(0,0,"AACAGTTACC","TAAGGTCA");
        assertEquals(7,result);

        result = PracExam3D.opt_alignment(0,0,"GATCCAG","ACAGA");
        assertEquals(7,result);

        result = PracExam3D.opt_alignment(0,0,"GTTGCAG","CGTTACCA");
        assertEquals(5,result);
    }

    @Test
    public void allOptAlign(){
        int[][] result;

        result = PracExam3D.allOptAlign("AACAGTTACC","TAAGGTCA");
        assertEquals(7,result[0][0]);

        result = PracExam3D.allOptAlign("GATCCAG","ACAGA");
        assertEquals(7,result[0][0]);

        result = PracExam3D.allOptAlign("GTTGCAG","CGTTACCA");
        assertEquals(5,result[0][0]);
    }

    @Test
    public void getAlignment(){
        char[][] result;

        result = PracExam3D.getAlignment("AACAGTTACC","TAAGGTCA");
        //assertEquals(7,result[0][0]);

        result = PracExam3D.getAlignment("GATCCAG","ACAGA");
        //assertEquals(7,result[0][0]);

        result = PracExam3D.getAlignment("GTTGCAG","CGTTACCA");
        //assertEquals(5,result[0][0]);
    }

    @Test
    public void costOfAlignment(){
        int result;

        result = PracExam3D.costOfAlignment("AACAGTTACC","TAAGGTCA");
        assertEquals(7,result);

        result = PracExam3D.costOfAlignment("GATCCAG","ACAGA");
        assertEquals(7,result);

        result = PracExam3D.costOfAlignment("GTTGCAG","CGTTACCA");
        assertEquals(5,result);
    }

}
