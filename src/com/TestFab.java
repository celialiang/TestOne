package com;

/**
 * Created by Celia on 11/7/2016. 迭代
 */
public class TestFab {
    public static void main (String args[]) {
        System.out.println(f(40));
    }
    public static long f (int n) {

        if (n < 1) {
            System.out.println("Invalid parameter!");
            return -1;
        }

        if ( n==1 || n==2) {
            return 1;
        }

        long f1 = 1;
        long f2 = 1;
        long f = f1 + f2;

        for (int i=1; i < n-1; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;

    }
}
