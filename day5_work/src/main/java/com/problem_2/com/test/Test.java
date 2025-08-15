package com.problem_2.com.test;

import com.problem_2.com.model.Trip;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Trip trip = (Trip) ctx.getBean("trip");
        trip.operation();
    }
}
