package com;

/**
 * Created by Celia on 11/5/2016.
 */
public class OddSum {
    public static void main (String args[]){
        long result = 0;
        for (int i = 1; i < 100; i = i + 2){
            result = result + i;
        }
        System.out.println("Result = " + result);

    }
}
