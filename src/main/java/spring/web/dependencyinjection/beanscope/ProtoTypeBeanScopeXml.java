package spring.web.dependencyinjection.beanscope;

public class ProtoTypeBeanScopeXml {
    // Create multiple Beans as per call

    public ProtoTypeBeanScopeXml(){
        System.out.println("Create ProtoType Bean  xml");
    }

    public void getName(){
        System.out.println("Hi.......I m a ProtoType bean  xml!!");
    }
}
