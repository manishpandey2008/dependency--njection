package spring.web.dependencyinjection.service;

import org.springframework.stereotype.Service;
import spring.web.dependencyinjection.repo.MyMessage;

//@Service("Constructor-Service")
public class ConstructorInjectorService  implements MyMessage {
    @Override
    public String getMessage() {
        return "Hi----------This is Constructor Injector Service";
    }
}
