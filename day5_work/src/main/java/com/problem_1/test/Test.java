package com.problem_1.test;

import com.problem_1.interceptor.MyInterceptor;
import com.problem_1.model.Person;
import com.problem_1.model.SaleMan;
import com.problem_1.model.Waiter;
import org.springframework.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Person  w= new Waiter();
        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(Waiter.class.getClassLoader());
        enhancer.setSuperclass(Waiter.class);
        enhancer.setCallback(new MyInterceptor(w));
        Waiter proxy = (Waiter) enhancer.create();
        proxy.service();
        proxy.pay();
        System.out.println("----------------------");
        Person  s= new SaleMan();
        enhancer.setSuperclass(SaleMan.class);
        enhancer.setCallback(new MyInterceptor(s));
        SaleMan proxy1 = (SaleMan) enhancer.create();
        proxy1.sale();
        proxy1.pay();
    }
}
