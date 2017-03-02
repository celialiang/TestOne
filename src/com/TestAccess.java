package com;

/**
 * Created by Celia on 1/5/2017.
 */
public class TestAccess {
    private int a = 0;
    int b = 0;
    protected int c = 0;
    public int d = 0;
}
//}
//
//class T {
//
//}

class T extends TestAccess {
    public void main(String args[]) {
            T t = new T();
            System.out.println(t.b);
        }
    }

