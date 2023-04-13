package org.springframework.di;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.di.controllers.MainController;
import org.springframework.di.controllers.PropertyInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext stx = SpringApplication.run(SfgDiApplication.class, args);

		//non ho bisogno di inizializzare l'oggetto grazie alla di
		MainController mainController = (MainController) stx.getBean("mainController");
		String sayHello = mainController.sayHello();
		System.out.println(sayHello);

		System.out.println("----------- property");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) stx.getBean("propertyInjectedController");
		String propertyHello = propertyInjectedController.printGreetings();
		System.out.println(propertyHello);



	}

}
