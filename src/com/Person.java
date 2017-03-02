package com;

/**
 * Created by Celia on 11/10/2016.
 */
public class Person {
    int id;
    int age = 20;

    // 构造方法，没有返回值 方法名称 和 类名称 一致；
    void Person (int _id, int _age) {
        id = _id;
        age = _age;
    }
}

class Test {
    public static void main (String args[]) {
        Person tom = new Person();
        tom.Person(1,25);
        Point1 P = new Point1();

    }
}

class Point1 {
    int x;
    int y;

}