package main.java.io.enn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting main");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After the context init");
        HelloWorld hello1 = context.getBean(HelloWorld.class);
        HelloWorld hello2 = context.getBean(HelloWorld.class);
        hello1.sayHello();
        System.out.println(hello1 == hello2);
        System.out.println("before closing the context");
        context.close();
        System.out.println("After closing the context");
    }
}
