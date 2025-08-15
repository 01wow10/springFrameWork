package com.problem_2.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    private String name;
    private String startAddress;
    private String endAddress;
    public void operation(){
        System.out.println("您好，"+name+"，欢迎您乘坐从"+startAddress+"地到"+endAddress+"地航班");
    }
}
