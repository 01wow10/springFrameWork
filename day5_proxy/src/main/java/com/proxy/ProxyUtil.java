package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Object getProxy(Object obj, InvocationHandler handler){
        ClassLoader classLoader = obj.getClass().getClassLoader();
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
