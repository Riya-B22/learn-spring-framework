package com.in28minutes.spring.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    @Autowired //156 - adding for loose coupling of spring framework
    private GamingConsole game;// 154 - interface 
    
    public GameRunner(GamingConsole game) { // Constructor based dependency injections
        super();
    	this.game=game;

    } 
//     in video 152 it was having these 3 lines and run method
//     private SuperMario game;
//     public GameRunner(SuperMario game){
//     this.game = game;
//     }
     

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
