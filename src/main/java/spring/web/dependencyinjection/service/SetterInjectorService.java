package spring.web.dependencyinjection.service;

import org.springframework.stereotype.Service;
import spring.web.dependencyinjection.repo.MyMessage;

@Service
public class SetterInjectorService implements MyMessage {
    @Override
    public String getMessage() {
        return "Hi---this is Setter Injector Service";
    }
}
