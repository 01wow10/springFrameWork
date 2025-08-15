package com.anno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component("teacher")//组件
//@Repository   应用在持久层组件上 数据库Dao
//@Service    应用在业务逻辑层组件上  Service
//@Controller   //应用在控制层组件上  Controller
public class Teacher {
    @Value("张三")
    private String name;
    @Value("18")
    private int age;

}
