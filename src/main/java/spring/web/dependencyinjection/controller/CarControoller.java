package spring.web.dependencyinjection.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import spring.web.dependencyinjection.factory.Car;

@Controller
public class CarControoller {
    private  final Car car;

    public CarControoller(@Qualifier("bMWCar") Car car) {
        this.car = car;
    }

    public String getCar(){
        return this.car.getCarName();
    }
}
