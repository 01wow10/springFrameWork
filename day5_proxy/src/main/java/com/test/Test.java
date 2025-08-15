package com.test;

import com.aop.UserService;
import com.aop.UserServiceImpl;
import com.invocationHandler.MyInvocationHandler;
import com.proxy.ProxyUtil;

public class Test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        UserService proxy = (UserService) ProxyUtil.getProxy(userService, new MyInvocationHandler(userService));
        proxy.save();
        proxy.delete();
    }
}
