package spring.web.dependencyinjection.beanscope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    // default Bean Scope is Singleton
    // Create only one Bean

    public SingletonBean(){
        System.out.println("Create Singleton Bean");
    }

    public void getName(){
        System.out.println("Hi.......I m a singleton bean !!");
    }
}
