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

            for (int v = 1; v <= n; v++) {
                if (length[v] == 0) continue;
                int newLengh = min + W[vNear][v];
                if (length[v] > newLengh) {
                    touch[v] = vNear;
                    length[v] = newLengh;
                }
            }
            length[vNear] = 0;
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
}
