package com.test;

import com.model.LibraryAdmin;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLibraryAdmin {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        LibraryAdmin libraryAdmin = (LibraryAdmin) ctx.getBean("libraryAdmin");
        libraryAdmin.check();
    }
}
