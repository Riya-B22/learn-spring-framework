package com.in28minutes.spring.learnspringframework;

import com.in28minutes.spring.learnspringframework.enterprise.example.web.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearnSpringFrameworkApplication.class, args);
//		SuperMario game=new SuperMario();
//		SuperContraGame game=new SuperContraGame();
//		PacMan game=new PacMan();
		// video 152 :After adding the interface we can do:
//		GamingConsole game = new PacMan();
//		GameRunner runner = new GameRunner(game);

		//video 154 Spring framework for loose coupling
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();

		//158 Does Spring Framework add value?
		MyWebController controller = context.getBean(MyWebController.class);
		System.out.println(controller.returnValueFromBusinessService());
	}

}
