package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.xml.Bike;

@Controller
public class XmlController {
    private final Bike bike;

    public XmlController(@Qualifier("heroBike") Bike bike) {
        this.bike = bike;
    }

    public String getBikeName(){
        return bike.getName();
    }
}
