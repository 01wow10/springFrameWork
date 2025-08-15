package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentGrades {
    private String name;
    private Map<String, Double> grades;
    public void printGrades(){
        System.out.println(name+"的课程成绩为：");
        Double sum = 0.0;
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            sum += entry.getValue();
        }
        System.out.println("总成绩为："+ sum);
    }
    public void addGrades(){
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            if(entry.getValue() < 60){
                entry.setValue(entry.getValue()*1.1);
            }
        }
        System.out.println("不及格的成绩已提升10%");
        printGrades();
    }
}
