package spring.web.dependencyinjection.xml;

import org.springframework.context.annotation.Primary;


public class HeroBike implements Bike{
    @Override
    public String getName() {
        return "Hi..........This is Hero bike";
    }
}
