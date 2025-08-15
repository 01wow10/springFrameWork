package com.test;

import com.model.Student;
import com.model.StudentDao;
import com.model.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentOperation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) ctx.getBean("studentService");
        StudentDao studentDao = (StudentDao) ctx.getBean("studentDaoJdbcImpl");
        studentService.setStudentDao(studentDao);
        Student s = (Student) ctx.getBean("student");
        studentService.saveStudent(s);
    }
}
