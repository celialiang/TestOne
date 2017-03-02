package com;

/**
 * Created by Celia on 11/7/2016.
 */
public class TestFactorialFive {
    public static void main (String args[]) {
        System.out.println(method(5));
    }
    public static int method(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n * method (n-1);
        }
    }
}
