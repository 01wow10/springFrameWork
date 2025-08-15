package com.user_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Boy boy = (Boy) applicationContext.getBean("boy");
        System.out.println(boy);
    }
}
