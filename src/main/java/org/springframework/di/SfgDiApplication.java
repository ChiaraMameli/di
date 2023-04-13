package org.springframework.di;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.di.controllers.MainController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext stx = SpringApplication.run(SfgDiApplication.class, args);

		MainController mainController = (MainController) stx.getBean("mainController");

		String sayHello = mainController.sayHello();

		System.out.println(sayHello);

	}

}
