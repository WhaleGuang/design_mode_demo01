package com.daqi.person.p3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkSingProxyGenerator implements InvocationHandler {
    private final Object replacement;

    public JdkSingProxyGenerator(Object o) {
        this.replacement = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("苍茫天涯你的爱❤");
        return method.invoke(replacement,args);//调用replacement原来的方法
    }
}
