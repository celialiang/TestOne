package com;

class SuperClass {
    private int n;

    SuperClass() {
        System.out.println("SuperClass()");
    }

    SuperClass(int n) {
        System.out.println("SuperClass(" + n + ")");
        this.n = n;  //就近申明,
    }
}

class SubClass extends SuperClass {
    private int n;

    SubClass() {
        super(300);
        System.out.println("SubClass()");
    }

    SubClass(int n) {
        System.out.println("SubClass(" + n + ")");
        this.n = n;
    }
}

public class TestSuperSub {
    public static void main(String arg[]) {
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(400);
    }
}