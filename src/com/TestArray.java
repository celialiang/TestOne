package com;
import java.util.Arrays;

public class TestArray {
    public static void main (String args[]) {
        int [] a = {2,4,5,6,7,8,9,1,3};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++ ) {
            System.out.println( a[i] );
        }
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
     }
}
