package io.enn.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Starting main");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After the context init");
        HelloWorld hello = context.getBean(HelloWorld.class);
        hello.sayHello();

        context.close();
    }
}
