package com.in28minutes.spring.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("SuperContraGame Jump");
    }
    public void down(){
        System.out.println("SuperContraGame Bend");
    }
    public void left(){
        System.out.println("SuperContraGame STOP");
    }
    public void right(){
        System.out.println("SuperContraGame Accelerate...");
    }

}
