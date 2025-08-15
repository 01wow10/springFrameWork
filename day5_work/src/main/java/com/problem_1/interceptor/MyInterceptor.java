package com.problem_1.interceptor;

import com.problem_1.model.SaleMan;
import com.problem_1.model.Waiter;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyInterceptor implements MethodInterceptor {
    private Object obj;
    public MyInterceptor(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        Object result = null;
        if(method.getName().equals("sale")||method.getName().equals("service")){
            System.out.println("您好，欢迎光临");
            result = method.invoke(obj, args);
        }
        else if(method.getName().equals("pay")){
            result = method.invoke(obj, args);
            if(obj.getClass().equals(Waiter.class)){
                System.out.println("请带好您的随身物品，慢走，欢迎再来");
            } else if(obj.getClass().equals(SaleMan.class)){
                System.out.println("慢走，欢迎下次再来");
            }
        }


        return result;
    }
}
