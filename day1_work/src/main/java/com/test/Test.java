package com.test;

import com.model.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) throws Exception {
        Teacher teacher = (Teacher)BeanFactory.getBean("teacher");
        System.out.println(teacher);
    }
}
