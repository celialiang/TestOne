package com;

/**
 * Created by Celia on 1/6/2017.
 */
class FatherClass {
    public int value;
    public void f() {
        value = 100;
        System.out.println(
                "FatherClass.value=" + value
        );
    }
}

class ChildrenClass extends FatherClass {
    public int value;
    public void f() {
        super.f();
        value = 200;
        System.out.println(
                "ChildrenClass.value=" + value
        );
        System.out.println(value);
        System.out.println(super.value);
    }
}

public class TestInherit {
    public static void main (String args[]) {
        ChildrenClass cc = new ChildrenClass();
        cc.f();
    }
}
