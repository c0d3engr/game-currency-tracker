package com.c0d3engr.game_currency_tracker;

import com.c0d3engr.game_currency_tracker.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

		User obj = context.getBean(User.class);

		obj.addUser();
	}
}
