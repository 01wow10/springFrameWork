package com.test;

import com.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RechargeAndConsumeTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountServiceImpl");
        accountService.recharge("admin", 100);
        //accountService.consume("admin", 100);
    }
}
