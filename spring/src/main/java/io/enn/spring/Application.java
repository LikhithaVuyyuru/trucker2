package io.enn.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Application {

    @Bean
    public HelloWorld randomMethod(){
        System.out.println("Inside bean factory method");
        return new HelloWorld();
    }
}
