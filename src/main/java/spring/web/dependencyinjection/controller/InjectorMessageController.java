package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.repo.MyMessage;

@Controller
public class InjectorMessageController {
//    private final MyMessage myMessage;
//
//    public InjectorMessageController(@Qualifier("injectorMessageImp") MyMessage myMessage) {
//        this.myMessage = myMessage;
//    }
//
//    public String getMessage(){
//        return this.myMessage.getMessage();
//    }
}
