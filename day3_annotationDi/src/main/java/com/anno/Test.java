package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean_annotation.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }
}
