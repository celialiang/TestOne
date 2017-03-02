package com;

/**
 * Created by Celia on 11/5/2016.
 */
public class TestWhile {
    public static void main(String args[]){
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i += 1;
        }
        do {
            System.out.println(i);
            i += 1;
        }
        while (i < 10);
    }
}
