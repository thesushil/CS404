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
            if (vNear == 0) continue; // no min found
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

    public static boolean oneWayStreets(int[][] W) {
        int n = W.length - 1;

        for (int i = 1; i < n; i++)
            for (int j = i + 1; j <= n; j++) {
                if (W[i][j] < INFINITE && W[j][i] < INFINITE) return false;
            }

        return true;
    }

    public static boolean stronglyConnected(int[][] W) {
        int n = W.length - 1;
        int[][] D = W.clone();

        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++) {
                    int newD = D[i][k] + D[k][j];
                    if (newD < D[i][j]) D[i][j] = newD;
                }

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (D[i][j] >= INFINITE) return false;

        return true;
    }

    public static int largestInCommon(int[] A, int[] B) {
        int max = 0, aCount = A.length, bCount = B.length;
        boolean hasCommon = false;

        for (int i = 0; i < aCount; i++) {
            if (hasCommon && A[i] <= max) continue;
            for (int j = 0; j < bCount; j++) {
                if (A[i] == B[j] && A[i] > max) {
                    max = A[i];
                    hasCommon = true;
                }
            }
        }

        return hasCommon ? max : -1;
    }

    public static void printPrimeFactorization(int n) {
        int nHalf = n / 2, num = n;
        boolean isPrime = true;

        for (int i = 2; i <= nHalf; i++) {
            int j = 0;
            while (n > 0 && n % i == 0) {
                n = n / i;
                j++;
                isPrime = false;
            }

            if (j > 0) System.out.printf("(%d^%d)", i, j);
        }

        if (isPrime) System.out.printf("(%d^1)", num);
    }

    public static boolean subString(String x, String y) {
        int m1 = x.length(), m2 = y.length();
        if (m1 == 0 || m2 == 0) return true;

        boolean foundFirstChar = false;
        int i = 0, j = 0;
        while (j < m2) {
            if (x.charAt(0) == y.charAt(j++)) {
                foundFirstChar = true;
                j--;
                break;
            }
        }
        if (!foundFirstChar) return false;

        while (i < m1 && j < m2) {
            if (x.charAt(i++) != y.charAt(j++)) return false;
        }
        return true;
    }

    public static boolean allEdgesUniqueWeights(int[][] W) {
        int n = W.length - 1, pos = 0;
        int[] uniques = new int[n * n];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                for (int k = 1; k <= pos; k++) {
                    if (uniques[k] == W[i][j]) return false;
                }
                uniques[++pos] = W[i][j];
            }
        }

        return true;
    }

}
