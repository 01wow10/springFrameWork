package com.model;

public class StudentService{
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void saveStudent(Student student) {
        System.out.println("StudentService处理学生信息...");
        studentDao.save(student);
    }
}
