package com.nus.iss.workshop11042.workshop11042;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Workshop11042Application {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(Workshop11042Application.class);
		// SpringApplication.run(Workshop11042Application.class, args);

		String port = "8080";
		ApplicationArguments app_args = new DefaultApplicationArguments(args);

		if (app_args.containsOption("port")) {

			port = app_args.getOptionValues("port").get(0);

		}

		System.out.println("New port number" +port);

		app.setDefaultProperties(Collections.singletonMap("server.port", port));

		app.run(args);

	}

}
