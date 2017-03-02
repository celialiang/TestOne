package com;

import java.security.PublicKey;

public interface ValuableOne {
    public double getMoney();
}
interface ProtectableOne {
    public void beProtected();
}
interface AA extends ProtectableOne {
    void m();
}

abstract class Animal {
    private String name;
    abstract void enjoy();
}

class GoldMonkey extends Animal implements ValuableOne, ProtectableOne {
    public double getMoney() {
        return 10000;
    }
    public void beProtected() {
        System.out.println("live in the room");
    }
    public void enjoy() {
    }
    public void test() {
        ValuableOne v = new GoldMonkey();
        v.getMoney();
        ProtectableOne p = (ProtectableOne)v;
        p.beProtected();
    }
}

class Hen implements AA {
    public void m() {}
    public void beProtected() {}
}
