package com.sushil;

public class PracExam4C {
    public static final int INFINITE = 9999;

    public static int[] bruteForceOptimal(int n, int a, int b, int c) {
        int count = Integer.MAX_VALUE;
        int[] sol = new int[3];

        for (int nc = 0; nc <= n / c; nc++)
            for (int nb = 0; nb <= n / b; nb++)
                for (int na = 0; na <= n / a; na++)
                    if (na * a + nb * b + nc * c == n && na + nb + nc < count) {
                        sol = new int[]{na, nb, nc};
                        count = na + nb + nc;
                    }

        return sol;
    }

    public static boolean hasStar(int[][] W) {
        int n = W.length - 1;
        for (int i = 1; i <= n; i++) {
            boolean isStar = true;
            for (int j = 1; j <= n; j++) {
                if (W[i][j] == INFINITE) {
                    isStar = false;
                    break;
                }
            }
            if (isStar) return true;
        }
        return false;
    }

    public static boolean primConnected(boolean[][] W) {
        int n = W.length - 1, source = 1;
        boolean[] distance = new boolean[n + 1];
        boolean[] unexplored = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            distance[i] = W[source][i];
            unexplored[i] = true;
        }
        unexplored[source] = false;

        for (int loop = 1; loop < n; loop++) {
            int vNear = 0;
            for (int i = 1; i <= n; i++) {
                if (distance[i] && unexplored[i]) {
                    vNear = i;
                    break;
                }
            }
            if (vNear == 0) return false;
            unexplored[vNear] = false;

            for (int i = 1; i <= n; i++) {
                if (W[i][vNear] && unexplored[i])
                    distance[i] = W[i][vNear];
            }
        }

        return true;
    }

    public static int numComponents(int[][] W) {
        int n = W.length - 1, source = 1;
        int[] distance = new int[n + 1], nearest = new int[n + 1];
        boolean[] unexplored = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            distance[i] = W[source][i];
            nearest[i] = source;
            unexplored[i] = true;
        }
        unexplored[source] = false;

        for (int loop = 1; loop < n; loop++) {

            int min = INFINITE, vNear = 0;
            for (int i = 1; i <= n; i++) {
                if (distance[i] < min && unexplored[i]) {
                    min = distance[i];
                    vNear = i;
                }
            }
            if(vNear == 0) continue; // no min found
            unexplored[vNear] = false;

            for (int i = 1; i <= n; i++) {
                if (W[vNear][i] < distance[i] && unexplored[i]) {
                    distance[i] = W[vNear][i];
                    nearest[i] = vNear;
                }
            }
        }

        int count = 1;
        for (int i = 1; i <= n; i++)
            if (distance[i] >= INFINITE) count++;

        return count;
    }

    public static boolean oneWayStreets(int [][] W) {
        int n = W.length - 1;

        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++) {
                if (W[i][j] < INFINITE && W[j][i] < INFINITE) return false;
            }

        return true;
    }

    public static boolean stronglyConnected(int [][] W) {
        int n = W.length - 1;
        return true;
    }

    public static int largestInCommon(int n, int [] A, int [] B) {
        return 1;
    }

    public static void printPrimeFactorization(int n) {

    }

    public static boolean subString(String x, String y) {
        return true;
    }

    public static boolean allEdgesUniqueWeights(int n, int [][] W) {
        return true;
    }



}
