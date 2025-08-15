package com.problem_2.com.myaspect;

import com.problem_2.com.model.Trip;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

@Component
@Aspect
public class MyAdvice {
    @Around(value = "execution(* operation(..))")
    public void check(ProceedingJoinPoint point){
        Trip trip = (Trip)point.getTarget();
        Map<String, String> map = new HashMap<>();
        ResourceBundle rb = ResourceBundle.getBundle("Address");
        for (String key : rb.keySet()) {
            map.put(key, rb.getString(key));
        }
        if(map.containsValue(trip.getStartAddress())){
            System.out.println("所在地区为高危风险区域，不允许出行");
        } else if(map.containsValue(trip.getEndAddress())){
            try {
                point.proceed();
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
            System.out.println("生成日志：姓名"+ trip.getName() + "，开始地址：" + trip.getStartAddress() + "，结束地址：" + trip.getEndAddress()+ "，出发时间："+LocalDateTime.now());
        }
    }
}
