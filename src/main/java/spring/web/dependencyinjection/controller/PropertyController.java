package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.repo.MyMessage;

@Controller("property-Controller")
public class PropertyController {

    @Autowired
    @Qualifier("propertyInjectorService")
    private  MyMessage myMessage;

    public String getMessage(){
        return myMessage.getMessage();
    }
}
