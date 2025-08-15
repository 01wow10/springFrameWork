package com.service;

import com.mapper.StudentMapper;
import com.model.Student;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;
    @Override
    public void save(Student student) {
        mapper.save(student);
    }
    @Override
    public List<Student> selectList() {
        return mapper.selectList();
    }
}
