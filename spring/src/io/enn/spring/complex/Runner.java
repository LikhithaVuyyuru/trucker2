package io.enn.spring.complex;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        System.out.println("After context creation");
        NotifService notifService = context.getBean(NotifService.class);
        notifService.sendNotification("likhitha530@gmail.com", "This is Spring");
        context.close();
    }
}
