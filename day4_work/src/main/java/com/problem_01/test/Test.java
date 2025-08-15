package com.problem_01.test;

import com.problem_01.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        User user = ctx.getBean("user", User.class);
        System.out.println(user);
    }
}
