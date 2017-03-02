package com;

class PersonTwo{
    private String name;
    private String location;
    PersonTwo (String name) {
        location = "Boston";
        this.name = name;
    }
    PersonTwo (String name, String location) {
        this.name = name;
        this.location = location;
    }
    public String info() {
        return "name: " + name + " location: " + location;
    }
}

class StudentTwo extends PersonTwo {
    private String school;
    StudentTwo (String name, String school) {
        //下行是值传递，相当于_name = name, _school = school
        //这里又调用了另外一个构造方法，this()有三个局部变量，接下。
        this(name, "Boston", school);
    }
    StudentTwo (String n, String l, String school) {
        super(n, l);
        this.school = school;
    }
    public String info() {
        return super.info() + " school: " + school;
    }
}

class TeacherTwo extends PersonTwo {
    private String title;
    private String school;

    TeacherTwo(String name, String school, String title) {
        this(name, "Boston", school, title);
    }
    TeacherTwo(String n, String l, String school, String title) {
        // 父类处理n,l

        super(n,l);
        this.school = school;
        this.title = title;
    }
    public String info() {
        return super.info() + " school: " + school + " title: " + title;
    }
}

public class PracticeExtendThree {
    public static void main (String args[]) {
        PersonTwo p1 = new PersonTwo("A");
        PersonTwo p2 = new PersonTwo("B", "Shanghai");
        TeacherTwo p3 = new TeacherTwo("B1","S1", "professor" );
        TeacherTwo p4 = new TeacherTwo("B1", "Boston", "S1", "professor");
        StudentTwo s1 = new StudentTwo("C", "S1");
        StudentTwo s2 = new StudentTwo("C","Shanghai","S2");
        System.out.println(p1.info());
        System.out.println(p2.info());
        System.out.println(s1.info());
        System.out.println(s2.info());
        System.out.println(p3.info());
        System.out.println(p4.info());
    }
}