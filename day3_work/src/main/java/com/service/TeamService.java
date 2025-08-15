package com.service;

public interface TeamService {
    public void createTeam(String teamName, String teamAddress);
    public void removeTeam(String teamName);
    public void checkTeam(String teamName);
}
