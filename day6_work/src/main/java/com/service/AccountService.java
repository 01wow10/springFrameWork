package com.service;

import com.model.Account;

import java.util.List;

public interface AccountService {
    void insert(Account account);
    List<Account> selectList();
    void recharge(String account ,int number);
    void consume(String account ,int number);
}
