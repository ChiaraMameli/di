package org.springframework.di;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.di.controllers.*;

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
		String propertyGreetings = propertyInjectedController.getGreetings();
		System.out.println(propertyGreetings);

		System.out.println("----------- setter");
		SetterInjectedController setterInjectedController =(SetterInjectedController) stx.getBean("setterInjectedController");
		String setterGreetings = setterInjectedController.getGreetings();
		System.out.println(setterGreetings);

		System.out.println("----------- constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) stx.getBean("constructorInjectedController");
		String constructorGreetings = constructorInjectedController.getGreetings();
		System.out.println(constructorGreetings);

		System.out.println("----------- profile");
		I18nController i18nController = (I18nController) stx.getBean("i18nController");
		String profileGreetings = i18nController.getGreetings();
		System.out.println(profileGreetings);
	}

}
