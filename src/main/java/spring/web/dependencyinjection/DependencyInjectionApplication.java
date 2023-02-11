package spring.web.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import spring.web.dependencyinjection.beanscope.ProtoTypeBeanScope;
import spring.web.dependencyinjection.beanscope.ProtoTypeBeanScopeXml;
import spring.web.dependencyinjection.beanscope.SingletonBean;
import spring.web.dependencyinjection.beanscope.SingletonBeanXml;
import spring.web.dependencyinjection.controller.*;
import spring.web.dependencyinjection.datasource.DbDatasource;
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


		// Bean Scope

		// ------------Singleton Bean ---------
		SingletonBean singletonBean= (SingletonBean) context.getBean("singletonBean");
		singletonBean.getName();

		SingletonBean singletonBean2= (SingletonBean) context.getBean("singletonBean");
		singletonBean2.getName();


		// ------------Prototype Bean ---------
		ProtoTypeBeanScope protoTypeBeanScope= (ProtoTypeBeanScope) context.getBean("protoTypeBeanScope");
		protoTypeBeanScope.getName();

		ProtoTypeBeanScope protoTypeBeanScope2= (ProtoTypeBeanScope) context.getBean("protoTypeBeanScope");
		protoTypeBeanScope2.getName();


		// ------------Singleton Bean XML ---------
		SingletonBeanXml singletonBeanXml= (SingletonBeanXml) context.getBean("singletonBeanXml");
		singletonBeanXml.getName();

		SingletonBeanXml singletonBeanXml2= (SingletonBeanXml) context.getBean("singletonBeanXml");
		singletonBeanXml2.getName();


		// ------------Prototype Bean MXL---------
		ProtoTypeBeanScopeXml protoTypeBeanScopeXml= (ProtoTypeBeanScopeXml) context.getBean("protoTypeBeanScopeXml");
		protoTypeBeanScopeXml.getName();

		ProtoTypeBeanScopeXml protoTypeBeanScopeXml2= (ProtoTypeBeanScopeXml) context.getBean("protoTypeBeanScopeXml");
		protoTypeBeanScopeXml2.getName();

		// datasource.properties data
		DbDatasource datasource= (DbDatasource) context.getBean("dbDatasource");
		System.out.println(datasource.getUsername()+" "+datasource.getPassword()+" "+datasource.getDbUrl());

	}

}
