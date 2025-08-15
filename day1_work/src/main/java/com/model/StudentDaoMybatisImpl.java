package com.model;

public class StudentDaoMybatisImpl implements StudentDao{

    @Override
    public void save(Student s) {
        System.out.println("使用StudentDaoMybatisImpl保存学生信息: " + s);
    }
}
