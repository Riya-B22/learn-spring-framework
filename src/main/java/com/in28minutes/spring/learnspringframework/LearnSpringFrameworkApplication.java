package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;
import com.in28minutes.spring.learnspringframework.game.GamingConsole;
import com.in28minutes.spring.learnspringframework.game.PacMan;
import com.in28minutes.spring.learnspringframework.game.SuperContraGame;
import com.in28minutes.spring.learnspringframework.game.SuperMario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		//video 152 
//		SuperMario game=new SuperMario();
//		GameRunner runner = new GameRunner(game); // tightly coupled
//		runner.run();	
//		SuperContraGame game=new SuperContraGame(); // 153 - creating object of another game type and calling gameRunner class with that
//		PacMan game=new PacMan();
//		GameRunner runner = new GameRunner(game); // tightly coupled(either packman or supercontraGame
//		runner.run();
		
		// 154 -  loose coupling  level 1 adding interfaces:
		

//		SuperMario game=new SuperMario(); //either direct class obj or interface obj like below: 
//		GamingConsole game = new SuperContraGame(); // 1st  step in order to create gamerunner class- creating instance of gaming console class.
//		GameRunner runner = new GameRunner(game);// pass the gamingConsole instance to the gamerunner class' constructor
//		runner.run();

		//video 156 Spring framework for loose coupling
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
//
//		//158 Does Spring Framework add value?
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
