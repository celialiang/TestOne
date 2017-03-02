package com;

/**
 * Created by Celia on 11/6/2016.
 */
public class PrimeNumOutput {
    public static void main (String args []) {
        int i;
        for (i = 101; i < 200; i += 2) {
            boolean f = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (f = false) {
                    continue;
                }
            }
            System.out.println ("prime Num = " + i );
        }
    }
}
