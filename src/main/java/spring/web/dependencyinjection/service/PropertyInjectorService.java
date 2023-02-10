package spring.web.dependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import spring.web.dependencyinjection.repo.MyMessage;

//@Service
public class PropertyInjectorService implements MyMessage {
    @Override
    public String getMessage() {
        return "Hi----This is Property Injector Service";
    }
}
