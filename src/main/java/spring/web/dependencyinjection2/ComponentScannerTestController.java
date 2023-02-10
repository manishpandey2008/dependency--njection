package spring.web.dependencyinjection2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.repo.MyMessage;

@Controller
public class ComponentScannerTestController {

  private final MyMessage myMessage;

    public ComponentScannerTestController(@Qualifier("Constructor-Service") MyMessage myMessage) {
        this.myMessage = myMessage;
    }

    public String getMessage(){
        return this.myMessage.getMessage();
    }


}
