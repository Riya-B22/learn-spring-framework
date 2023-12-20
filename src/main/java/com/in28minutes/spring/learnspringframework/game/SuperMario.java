package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperMario implements GamingConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Bend");
    }
    public void left(){
        System.out.println("STOP");
    }
    public void right(){
        System.out.println("Accelerate...");
    }

}
