package com;

/**
 * Created by Celia on 11/21/2016.
 */
public class Leaf {
    int i = 0;
    Leaf (int i) {
        this.i = i;
    }
    // This is a method, name increment.返回Leaf
    Leaf increment() {
        i ++ ;
        return this;
    }
    void print () {
        System.out.println("i = " + i);
    }
    public static void main (String args[]) {
        Leaf leaf = new Leaf(100);
        leaf.increment().increment().print();
    }
}
