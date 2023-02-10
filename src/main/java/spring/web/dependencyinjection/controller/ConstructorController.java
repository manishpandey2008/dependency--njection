package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.repo.MyMessage;

@Controller
public class ConstructorController {

    private final MyMessage myMessage;


    public ConstructorController(@Qualifier("Constructor-Service") MyMessage myMessage) {
        this.myMessage = myMessage;
    }

    public String getMessage(){
        return this.myMessage.getMessage();
    }
}
