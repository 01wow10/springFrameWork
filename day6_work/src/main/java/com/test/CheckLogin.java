package com.test;

import com.model.Account;
import com.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        AccountService accountService = (AccountService) ctx.getBean("accountServiceImpl");
        List<Account> accounts = accountService.selectList();
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String account = sc.next();
        System.out.println("输入密码：");
        String password = sc.next();
        Boolean flag = false;
        for (Account account1 : accounts) {
            if (account1.getAccount().equals(account) && account1.getPassword().equals(password)) {
                System.out.println("登录成功！");
                flag = true;
            }
        }
        if(!flag){
            System.out.println("登录失败！");
        }

    }
}
