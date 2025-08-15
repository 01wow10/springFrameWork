package com.service;


import com.dao.TeamDao;
import com.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("teamService")
public class TeamServiceImpl implements TeamService {
    private final TeamDao teamDao;

    public TeamServiceImpl(@Qualifier("teamDao") TeamDao teamDao) {
        this.teamDao = teamDao;
    }


    @Override
    public void createTeam(String teamName, String teamAddress) {
        teamDao.add(new Team(teamName, teamAddress));
    }

    @Override
    public void removeTeam(String teamName) {
        teamDao.delete(teamName);
    }

    @Override
    public void checkTeam(String teamName) {
        teamDao.select(teamName);
    }
}
