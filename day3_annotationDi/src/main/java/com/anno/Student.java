package com.anno;

import jakarta.annotation.Resource;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Data
@Component
public class Student {
    @Value("张三")
    private String name;
    @Value("18")
    private int age;
    //@Qualifier("teacher")
    //@Resource( name="teacher")
    private final Teacher teacher;

    public Student(Teacher teacher) {
        this.teacher = teacher;
    }
}
