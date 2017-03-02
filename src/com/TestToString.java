package com;

/**
 * Created by Celia on 1/17/2017.
 */
public class TestToString {
    public static void main (String args[]) {
        // new了一个新的对象d。
        DogOne d = new DogOne();
        System.out.println("d: = " + d );
    }
}

class DogOne {
    // 对象d的成员和局部变量。
    // 如果不定义ToString，则会返回 getClass().getName + '@' + Integer.toHexString(hasCode())
    public String toString () {
        return "I am a hot dog.";
    }
}
