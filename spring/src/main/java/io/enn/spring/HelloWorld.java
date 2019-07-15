package main.java.io.enn.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class HelloWorld {

    public HelloWorld(){
        System.out.println("Inside the bean constructor");
    }

    public void sayHello(){
        System.out.println("Spring Application");
    }

    @PostConstruct
    public void postConstruct() throws Exception{
       System.out.println("Inside the afterPropertiesSet");
    }

    @PreDestroy
    public void preDestroy() throws Exception{
        System.out.println("Inside the destroy");
    }

}
