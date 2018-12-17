package com.daqi.person.p1;

//代替者
public class Replace implements Exam {
    private final Exam studentexam;

    public Replace(Exam studentexam) {
        this.studentexam = studentexam;
    }

    @Override
    public void toTest() {
        System.out.println("苍茫天涯你的爱❤");
        studentexam.toTest();
        System.out.println("考完试咯~~~");
    }
}
