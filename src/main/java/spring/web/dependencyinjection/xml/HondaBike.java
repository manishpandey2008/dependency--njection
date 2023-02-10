package spring.web.dependencyinjection.xml;

import org.springframework.context.annotation.Primary;

@Primary
public class HondaBike implements Bike{
    @Override
    public String getName() {
        return "Hi..............This is Honda Bike";
    }
}
