package com.daqi.person.p1;

public class Student implements Exam{
    @Override
    public void toTest() {
        System.out.println("要去考试...");
    }
}
