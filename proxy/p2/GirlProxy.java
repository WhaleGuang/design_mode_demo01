package com.daqi.person.p2;

public class GirlProxy implements Sleepabel {
    private final Sleepabel girl;

    public GirlProxy(Sleepabel g) {
        this.girl = g;
    }

    @Override
    public void sleep() {
        System.out.println("苍茫的天涯我的爱...");
        girl.sleep();
    }
}