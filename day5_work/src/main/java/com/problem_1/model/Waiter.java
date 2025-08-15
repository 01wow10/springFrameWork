package com.problem_1.model;

public class Waiter implements  Person{
    public void service(){
        System.out.println("请看一下菜单");
    }
    public void pay(){
        System.out.println("请扫码支付");
    }
}
