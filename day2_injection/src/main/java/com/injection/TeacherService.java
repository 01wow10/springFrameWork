package com.injection;

import java.util.*;

public class TeacherService {
    private TeacherDao teacherDao;
    private String name;
    private int age;
    private String [] addresses;
    private Set<String> set;
    private List< String> list;
    private Map<String, Double> map;
    private Properties properties;

    @Override
    public String toString() {
        return "TeacherService{" +
                "teacherDao=" + teacherDao +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", addresses=" + Arrays.toString(addresses) +
                ", set=" + set +
                ", list=" + list +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }

    public TeacherService() {
    }
    public TeacherService(TeacherDao teacherDao, String name, int age, String[] addresses, Set<String> set, List<String> list, Map<String, Double> map, Properties properties) {
        this.teacherDao = teacherDao;
        this.name = name;
        this.age = age;
        this.addresses = addresses;
        this.set = set;
        this.list = list;
        this.map = map;
        this.properties = properties;
    }

    public TeacherDao getTeacherDao() {
        return teacherDao;
    }

    public void setTeacherDao(TeacherDao teacherDao) {
        this.teacherDao = teacherDao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, Double> getMap() {
        return map;
    }

    public void setMap(Map<String, Double> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
