package com;

/**
 * Created by Celia on 11/5/2016.
 */
public class TestFactorial {
    public static void main (String args[]){
        long result = 0;
        long f = 1;
        for (int i = 1; i <= 10; i++){
            f = i * f;
            result +=  f;
        }
        System.out.println("printout = " + result);
    }
}
