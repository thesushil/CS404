package com.sushil;

public class PracExam4C {
    public static int[] bruteForceOptimal(int n, int a, int b, int c) {
        int count = Integer.MAX_VALUE;
        int[] sol = new int[3];

        for (int nc = 0; nc <= n; nc++)
            for (int nb = 0; nb <= n; nb++)
                for (int na = 0; na <= n; na++)
                    if (na * a + nb * b + nc * c == n && na + nb + nc < count) {
                        sol = new int[]{na, nb, nc};
                        count = na + nb + nc;
                    }

        return sol;
    }
}
