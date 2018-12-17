package com.daqi.person.p2;

//jdbk用法的缺点：用的时候必须基于接口，这个就是它的缺点
public class Main {
    public static void main(String[] args) {
        //用借口把女孩睡觉的方法写出来
        Sleepabel g=new Girl();
        g.sleep();


        System.out.println("---------------------------------------------------");

        Sleepabel gp=new GirlProxy(g);
        gp.sleep();
    }
}
