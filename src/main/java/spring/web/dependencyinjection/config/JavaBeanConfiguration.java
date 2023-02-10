package spring.web.dependencyinjection.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.web.dependencyinjection.factory.Car;
import spring.web.dependencyinjection.factory.FactoryTesting;
import spring.web.dependencyinjection.factory.SuvCar;
import spring.web.dependencyinjection.repo.InjectorMessage;
import spring.web.dependencyinjection.service.ConstructorInjectorService;

import spring.web.dependencyinjection.service.PropertyInjectorService;

@Configuration
public class JavaBeanConfiguration {
    // In Spring we have option to create beans by the help of @Component , @Service, @Controller , @RestController, @Repository .... and @ComponentScan

    // But Java Configuration is more usefull than spring annotions

    @Bean("Constructor-Service")
    ConstructorInjectorService constructorInjectorService(){
        return new ConstructorInjectorService();
    }

    @Bean
    PropertyInjectorService propertyInjectorService(){
        return new PropertyInjectorService();
    }

//    @Bean
//    InjectorMessageImp injectorMessageImp(){
//        return new InjectorMessageImp();
//    }

//    @Bean
//    InjectorMessageService InjectorMessageService(){
//        return new InjectorMessageService(injectorMessageImp());
//    }

//    ------------------------Factory---------------------------------------

    @Bean
    FactoryTesting factoryTesting(){
        return new FactoryTesting();
    }

    @Bean
    Car suvCar(FactoryTesting factoryTesting){
        return factoryTesting.getCarObj("suv");
    }

    @Bean
    Car bMWCar(FactoryTesting factoryTesting){
        return factoryTesting.getCarObj("bmw");
    }
}
