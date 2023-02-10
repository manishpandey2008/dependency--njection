package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.repo.MyMessage;
import spring.web.dependencyinjection.service.SetterInjectorService;

@Controller
public class SetterController {

    private MyMessage myMessage;

    @Autowired
    public void setSetterInjectorService(@Qualifier("setterInjectorService") MyMessage myMessage){
        this.myMessage=myMessage;
    }

    public String getMessage(){
        return myMessage.getMessage();
    }
}
