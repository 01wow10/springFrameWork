package com.test;

import com.model.Account;
import com.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountServiceImpl");
        accountService.insert(new Account(0, "admin", "123456", 500));
        List<Account> accounts = accountService.selectList();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
