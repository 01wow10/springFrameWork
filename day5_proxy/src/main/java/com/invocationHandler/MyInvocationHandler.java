package com.invocationHandler;
import lombok.AllArgsConstructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
@AllArgsConstructor
public class MyInvocationHandler implements InvocationHandler {
    private Object obj;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置操作");
        Object o = method.invoke(obj, args);
        System.out.println("后置操作");
        return o;
    }
}
