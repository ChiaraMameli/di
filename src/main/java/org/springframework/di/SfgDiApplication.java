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
		System.out.println(mainController.sayHello());

		System.out.println("----------- property");
		PropertyInjectedController propertyInjectedController =(PropertyInjectedController) stx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreetings());

		System.out.println("----------- setter");
		SetterInjectedController setterInjectedController =(SetterInjectedController) stx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreetings());

		System.out.println("----------- constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) stx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreetings());

		System.out.println("----------- profile");
		I18nController i18nController = (I18nController) stx.getBean("i18nController");
		System.out.println(i18nController.getGreetings());
	}

}
