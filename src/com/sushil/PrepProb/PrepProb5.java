package com.sushil.PrepProb;

public class PrepProb5{

    public static void test(){
        int[][]B = new int[][] {
                {1,1,2,9,11},
                {1,1,4,10,11},
                {5,3,2,8,6},
                {3,4,3,2,7},
                {5,3,2,8,6}
        };
        boolean result = hasRowWithAllValuesTheSame(B, B.length);
        System.out.println(result);
    }

    public static boolean hasRowWithAllValuesTheSame(int [][] B, int n) {
        for(int r1 = 0; r1<n; r1++){
            for(int r2 = r1+1; r2<n; r2++){
                int j = 0;
                for(;j<n;j++) if(B[r1][j] != B[r2][j]) break;
                if(j==n) return true;
            }
        }
        return false;
    }
}
