package spring.web.dependencyinjection.controller;

import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.xml.Bike;

@Controller
public class XmlController {
    private final Bike bike;

    public XmlController(Bike bike) {
        this.bike = bike;
    }

    public String getBikeName(){
        return bike.getName();
    }
}
