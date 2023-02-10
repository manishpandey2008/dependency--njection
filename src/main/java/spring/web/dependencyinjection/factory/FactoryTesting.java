package spring.web.dependencyinjection.factory;

public class FactoryTesting {
    public  Car getCarObj(String name){
        switch (name){
            case "suv": return new SuvCar();
            case "bmw": return new BMWCar();
            default: return new SuvCar();
        }
    }
}
