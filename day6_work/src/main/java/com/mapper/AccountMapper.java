package com.mapper;

import com.model.Account;
import com.model.Record;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountMapper {
    void insert(Account account);
    void recharge(@Param("account")String account ,@Param("number")int number);
    void consume(@Param("account")String account , @Param("number")int number);
    List<Account> selectList();
    void record(Record record);
}
