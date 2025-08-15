package com.dao;

import com.model.Team;

public interface Dao {
    public void add(Team  team);
    public void delete(String  name);
    public void  select(String name);
}
