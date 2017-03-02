package com;

import javax.swing.*;

interface Singer {
    public void sing();
    public void sleep();
}

interface Painter {
    public void paint();
    public void eat();
}

class student implements Singer {
    private String name;
    student (String name) {
        this.name = name;
    }
    public void study() {
        System.out.println("Studying");
    }
    public String getName() {
        return name;
    }
    public void sing() {
        // rewrite;
        System.out.println("student is a singer");
    }
    public void sleep() {
        // rewrite;
        System.out.println("Student is sleeping.");
    }
}

public class TestThree {
    public static void main (String args[]) {
        Singer s1 = new student("le");
        s1.sing();
        s1.sleep();
        Singer s2 = new Teacher("steven");
        s2.sing();
        s2.sleep();
        Painter p1 = (Painter)s2;
        p1.paint();
        p1.eat();
    }
}

class Teacher implements Singer, Painter {
    private String name;
    public String getString() {
        return name;
    }
    Teacher (String name) {
        this.name = name;
    }
    public void sing() {
        System.out.println ("teacher is singing.");
    }
    public void sleep() {
        System.out.println ("teacher is sleeping");
    }
    public void paint() {
        System.out.println ("teacher is paiting");
    }
    public void eat() {
        System.out.println ("teacher is eating");
    }
}

