package com.sushil;

public class PracExam4B {

    public static int vertexWithHighestTotalWeight(int[][] W) {
        int n = W.length - 1, sumMax = 0, vMax = 1;
        for (int v = 1; v <= n; v++) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += W[v][i] + W[i][v];
            if (sum > sumMax) {
                sumMax = sum;
                vMax = v;
            }
        }
        return vMax;
    }

    public static int[] greedySolution(int n, int k, int[] D) {
        int[] sol = new int[k + 1];

        for (int c = 1; c <= k; c++) {
            int cn = 0;
            while (n > 0) {
                n -= D[c];
                cn++;
            }
            if (n == 0) {
                sol[c] = cn;
                return sol;
            }
            if (n < 0) {
                sol[c] = cn - 1;
                n += D[c];
            }
        }
        if (n > 0) sol[1] = -1;
        return sol;
    }

    public static int minSpanTreeCost_or_numUnreachable(int[][] W) {
        int n = W.length - 1, source = 1;
        int[] nearest = new int[n + 1], distance = new int[n + 1];
        boolean[] unexplored = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            nearest[i] = source;
            distance[i] = W[i][source];
            unexplored[i] = true;
        }
        unexplored[source] = false;

        for (int loop = 1; loop < n; loop++) {
            int vNear = source, min = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                if (distance[i] < min && unexplored[i]) {
                    min = distance[i];
                    vNear = i;
                }
            }

            unexplored[vNear] = false;

            for (int i = 1; i <= n; i++) {
                if (W[vNear][i] < distance[i] && unexplored[i]) {
                    distance[i] = W[vNear][i];
                    nearest[i] = vNear;
                }
            }

        }

        // calculate cost of the spanning tree
        int cost = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] == 9999) {
                cost = 0;
                break;
            }
            else cost += distance[i];
        }
        if(cost > 0) return cost;

        // count number of unreachable nodes
        int numUnreachable = 0;
        for(int destV = 1; destV <= n; destV++){
            if(destV == source) continue;

            int v = destV;
            while(v != source){
                if(distance[v] == 9999){
                    numUnreachable--;
                    break;
                }
                v = nearest[v];
            }
        }
        return numUnreachable;
    }

    public static void nonRecDijkstraPrintPath(int s, int d, int[] touch) {
        int n = touch.length - 1, k = 0;
        int[] path = new int[n + 1];

        while (s != d) {
            path[++k] = d;
            d = touch[d];
        }
        path[++k] = d;

        for (int i = k; i > 0; i--) {
            System.out.print(path[i]);
        }
    }

}