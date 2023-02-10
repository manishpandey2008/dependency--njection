package spring.web.dependencyinjection.beanscope;

public class SingletonBeanXml {
    public SingletonBeanXml(){
        System.out.println("Create Singleton Bean xml");
    }

    public void getName(){
        System.out.println("Hi.......I m a singleton bean xml !!");
    }
}
