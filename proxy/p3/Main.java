package com.daqi.person.p3;

import com.daqi.person.p1.Exam;
import com.daqi.person.p1.Student;
import com.daqi.person.p2.Girl;
import com.daqi.person.p2.Sleepabel;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        Exam replace = (Exam) Proxy.newProxyInstance(
                cl, new Class[]{Exam.class},
                new JdkSingProxyGenerator(new Student())
        );

        replace.toTest();
        System.out.println("--------------------------------------------------------");


        Sleepabel sleepabel = (Sleepabel) Proxy.newProxyInstance(
                cl, Girl.class.getInterfaces(),
                new JdkSingProxyGenerator(new Girl())
        );
        sleepabel.sleep();
    }
}
