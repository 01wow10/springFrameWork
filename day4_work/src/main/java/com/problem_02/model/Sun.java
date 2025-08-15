package com.problem_02.model;

public class Sun implements  People{
    private Gao gao;
    public void introduction()
    {
        if(gao==null){
            gao = new Gao();
        }
        gao.introduction();
        operation();
        operation2();
    }
    public void operation()
    {
        System.out.println("和猪八戒战斗");
    }
    public void operation2()
    {
        System.out.println("抓住猪八戒");
    }
}
