package spring.web.dependencyinjection.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import spring.web.dependencyinjection.datasource.DbDatasource;
import spring.web.dependencyinjection.factory.Car;
import spring.web.dependencyinjection.factory.FactoryTesting;
import spring.web.dependencyinjection.service.ConstructorInjectorService;

import spring.web.dependencyinjection.service.PropertyInjectorService;

@Configuration
@ImportResource({"classpath:bike.xml", "classpath:bean-scope.xml"})
@PropertySource("classpath:datasource.properties")
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

    // Datasource configuration

    // application.properties or yml file override this resorce.properties file
    @Bean
    DbDatasource dbDatasource(@Value("${di.username}") String username,
                              @Value("${di.password}") String password,
                              @Value("${di.dbUrl}") String dbUrl){
        DbDatasource dbDatasource=new DbDatasource();
        dbDatasource.setUsername(username);
        dbDatasource.setPassword(password);
        dbDatasource.setDbUrl(dbUrl);

        return dbDatasource;
    }
}
