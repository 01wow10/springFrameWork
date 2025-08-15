package com.service;

import com.model.Student;

import java.util.List;

public interface StudentService {
    void save(Student student);
    List<Student> selectList();
}
