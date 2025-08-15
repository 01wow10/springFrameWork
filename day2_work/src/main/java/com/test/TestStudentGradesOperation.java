package com.test;

import com.model.StudentGrades;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentGradesOperation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext3.xml");
        StudentGrades studentGrades = (StudentGrades) ctx.getBean("studentGrades");
        studentGrades.printGrades();
        studentGrades.addGrades();
    }
}
