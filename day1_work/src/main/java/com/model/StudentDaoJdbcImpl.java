package com.model;

public class StudentDaoJdbcImpl implements StudentDao{

    @Override
    public void save(Student s) {
        System.out.println("使用StudentDaoJdbcImpl保存学生信息: " + s);
    }
}
