package com;

class PersonOne{
    private String name;
    private String location;
    PersonOne (String name) {
        location = "Boston";
        this.name = name;
    }
    PersonOne (String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String info() {
        return "name: " + name + " location: " + location;
    }
}

class StudentOne extends PersonOne {
    private String school;
    StudentOne (String name, String school) {
        //下行是值传递，相当于_name = name, _school = school
        //这里又调用了另外一个构造方法，this()有三个局部变量，接下。
        this(name, "Boston", school);
    }
    StudentOne (String n, String l, String school) {
        super(n, l);
        this.school = school;
    }
    public String info() {
        return super.info() + " school: " + school;
    }
}

public class PracticeExtendTwo {
    public static void main (String args[]) {
        PersonOne p1 = new PersonOne("A");
        PersonOne p2 = new PersonOne("B", "Shanghai");
        StudentOne s1 = new StudentOne("C", "S1");
        StudentOne s2 = new StudentOne("C","Shanghai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
    }
}