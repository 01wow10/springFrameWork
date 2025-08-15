package com.test;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        StudentService studentService = (StudentService) ctx.getBean(StudentServiceImpl.class);
        List<Student> students = studentService.selectList();
        for (Student student : students) {
            System.out.println(student);
        }
        Student student = new Student(3, "张三", 18, "男");
        studentService.save(student);
        students = studentService.selectList();
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
