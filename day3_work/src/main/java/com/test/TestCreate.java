package com.test;

import com.service.TeamServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCreate {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        TeamServiceImpl teamService = (TeamServiceImpl) ctx.getBean("teamService");
        teamService.createTeam("湖人", "洛杉矶");
        teamService.createTeam("快船", "洛杉矶");
        teamService.createTeam("勇士", "金州");
    }
}
