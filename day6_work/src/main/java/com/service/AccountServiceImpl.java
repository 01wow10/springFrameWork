package com.service;

import com.mapper.AccountMapper;
import com.model.Account;
import com.model.Record;


import javax.annotation.Resource;
import java.sql.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService{
    @Resource
    private AccountMapper accountMapper;
    @Override
    public void insert(Account account) {
        accountMapper.insert(account);
    }
    @Override
    public List<Account> selectList() {
        return accountMapper.selectList();
    }
    //@Transactional(timeout=5)
    @Override
    public void recharge(String account, int number) {
        try {
            System.out.println("开始充值...");
            accountMapper.recharge(account,number);
            accountMapper.record(new Record(0,account,new Date(System.currentTimeMillis()),"充值",number));
            Thread.sleep(6000);//模拟耗时
            accountMapper.recharge(account,0);
            System.out.println("充值成功！");
        } catch (Exception e) {
            throw new RuntimeException("网络超时，数据已回滚", e);
        }
    }
    //@Transactional(timeout=5)
    @Override
    public void consume(String account, int number) {

        try {
            System.out.println("开始购买...");
            accountMapper.consume(account,number);
            accountMapper.record(new Record(0,account,new Date(System.currentTimeMillis()),"消费",number));
            System.out.println("购买成功！");
        } catch (Exception e) {
            throw new RuntimeException("网络超时，数据已回滚", e);
        }
    }
}
