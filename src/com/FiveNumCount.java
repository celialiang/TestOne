package com;

/**
 * Created by Celia on 11/6/2016.
 */
public class FiveNumCount {
    public static void main(String args[]){
        int i = 1;
        int num = 0;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println(i);
                num ++ ;
            }
            if (num == 5) {
                break;
            }
            i++;
        }
    }
}
