package com.service;

import com.entity.Student;

import java.util.List;

public interface StudentService {
    void insert(Student student);
    List<Student> select(Integer id);
    void delete(Integer id);
    void update(Student student);
    List<Student> selectList();
}
