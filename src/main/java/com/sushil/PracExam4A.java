package com.sushil;

public class PracExam4A {
    public static void dijkstra(int[][] W, int[] touch, int source) {
        int n = W.length - 1;
        int[] length = new int[W.length];

        // initialize touch and length
        for (int i = 1; i <= n; i++) {
            touch[i] = source;
            length[i] = W[source][i];
        }

        for (int loop = 1; loop < n; loop++) {
            // find new (non zero) nearest vertex
            int min = Integer.MAX_VALUE, vNear = 0;
            for (int i = 1; i <= n; i++) {
                if (length[i] != 0 && length[i] < min) {
                    min = length[i];
                    vNear = i;
                }
            }

            length[vNear] = 0;

            for (int v = 1; v <= n; v++) {
                if (length[v] == 0) continue;
                int newLengh = min + W[vNear][v];
                if (length[v] > newLengh) {
                    touch[v] = vNear;
                    length[v] = newLengh;
                }
            }
        }
    }

    public static void printPath(int source, int destination, int[] touch) {
        if (source == destination) {
            System.out.printf("%s ", destination);
            return;
        }
        printPath(source, touch[destination], touch);
        System.out.printf("%s ", destination);
    }

    public static void dijkstra2(int[][] W, int[] touch, int[] distance, int source) {
        int n = W.length - 1;
        int[] length = new int[W.length];

        // initialize touch and length
        for (int i = 1; i <= n; i++) {
            touch[i] = source;
            length[i] = W[source][i];
            distance[i] = W[source][i];
        }

        for (int loop = 1; loop < n; loop++) {
            // find new (non zero) nearest vertex
            int min = Integer.MAX_VALUE, vNear = 0;
            for (int i = 1; i <= n; i++) {
                if (length[i] != 0 && length[i] < min) {
                    min = length[i];
                    vNear = i;
                }
            }

            for (int v = 1; v <= n; v++) {
                if (length[v] == 0) continue;
                int newLengh = min + W[vNear][v];
                if (length[v] > newLengh) {
                    touch[v] = vNear;
                    length[v] = newLengh;
                }
            }
            distance[vNear] = length[vNear];
            length[vNear] = 0;
        }
    }

    public static boolean hasCycle(int n, int[][] W) {
        return false;
    }

    public static void prim(int[][] W, int[] nearest, int source) {
        int n = W.length - 1;
        int[] distance = new int[n + 1];
        boolean[] unexplored = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            nearest[i] = source;
            distance[i] = W[source][i];
            unexplored[i] = true;
        }
        unexplored[source] = false;

        for (int loop = 1; loop < n; loop++) {
            int min = Integer.MAX_VALUE, vNear = 0;
            for (int i = 1; i <= n; i++) {
                if (distance[i] < min && unexplored[i]) {
                    min = distance[i];
                    vNear = i;
                }
            }

            unexplored[vNear] = false;

            for (int i = 1; i <= n; i++) {
                if (W[i][vNear] < distance[i] && unexplored[i]) {
                    nearest[i] = vNear;
                    distance[i] = W[i][vNear];
                }
            }
        }
    }

    public static void printMinSpanTree(int[] nearest) {
        int n = nearest.length - 1;

        for (int i = 1; i <= n; i++) {
            if (nearest[i] == i) continue; // skip source vertex
            System.out.printf("(%d,%d) ", nearest[i], i);
        }
    }

}
