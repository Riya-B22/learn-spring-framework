package com.in28minutes.spring.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
