package spring.web.dependencyinjection.beanscope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProtoTypeBeanScope {

    // Create multiple Beans as per call

    public ProtoTypeBeanScope(){
        System.out.println("Create ProtoType Bean  ");
    }

    public void getName(){
        System.out.println("Hi.......I m a ProtoType bean !!");
    }
}
