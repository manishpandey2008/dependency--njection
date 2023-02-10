package spring.web.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.web.dependencyinjection.controller.*;
import spring.web.dependencyinjection2.ComponentScannerTestController;

@SpringBootApplication
@ComponentScan(basePackages = {"spring.web.dependencyinjection"," spring.web.dependencyinjection2"})
public class DependencyInjectionApplication {

	public static  void main(String[] args) {
		ApplicationContext context=  SpringApplication.run(DependencyInjectionApplication.class, args);

		ConstructorController constructorController= (ConstructorController) context.getBean("constructorController");
		System.out.println(constructorController.getMessage());


		PropertyController propertyController= (PropertyController) context.getBean("property-Controller");
		System.out.println(propertyController.getMessage());


		// Apply ComponentScan annotation
		ComponentScannerTestController constructorController2= (ComponentScannerTestController) context.getBean("componentScannerTestController");
		System.out.println(constructorController2.getMessage());

		// Injector other service
//		InjectorMessageController injectorMessageController= (InjectorMessageController) context.getBean("injectorMessageController");
//		System.out.println(injectorMessageController.getMessage());


		// Factory Implementation
		CarControoller carControoller= (CarControoller) context.getBean("carControoller");
		System.out.println(carControoller.getCar());

		// XML Bean Configuration

		XmlController xmlController= (XmlController) context.getBean("xmlController");
		System.out.println(xmlController.getBikeName());
	}

}
