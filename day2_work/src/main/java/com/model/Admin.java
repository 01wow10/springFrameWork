package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {
    List< Student> students;
    public void check()
    {
        for (Student student : students)
        {
            if(student.getGender().equals("男"))
            {
                System.out.println(student.getName() + "是男生，可以进入浴池洗浴");
            }
            else{
                System.out.println(student.getName() + "是女生，不可以进入浴池洗浴");
            }
        }
    }
}
