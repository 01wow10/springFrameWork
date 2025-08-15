package com.dao;

import com.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TeamDao implements Dao{
    private final JdbcTemplate jdbcTemplate;

    public TeamDao(@Qualifier("jdbcTemplate") JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void add(Team team){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        jdbcTemplate.update("insert into basketballteam(name,address) values(?,?)",team.getName(),team.getAddress());
        System.out.println("添加"+team.getName()+"成功");
    }
    @Override
    public void delete(String name){
        jdbcTemplate.update("delete from basketballteam where name=?",name);
        System.out.println("删除"+name+"成功");
    }

    @Override
    public void select(String name) {
        jdbcTemplate.query("select * from basketballteam where name=?",new Object[]{name},(rs,rowNum)->{
            Team team = new Team();
            team.setName(rs.getString("name"));
            team.setAddress(rs.getString("address"));
            System.out.println(team);
            return team;
        });
    }


}
