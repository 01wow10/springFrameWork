package com.test;

import com.service.TeamServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSelect {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        TeamServiceImpl teamService = (TeamServiceImpl) ctx.getBean("teamService");
        teamService.checkTeam("湖人");
    }
}
