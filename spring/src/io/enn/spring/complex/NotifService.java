package io.enn.spring.complex;

import io.enn.spring.complex.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotifService {

    //property based DI
    @Autowired
    @Qualifier("awsService")
    public EmailService emailService;


    //constructor based DI
 //   @Autowired
 //   public NotifService(EmailService emailService){
//        System.out.println("NotifService Constructor");
//        this.emailService = emailService;
//    }

    public void sendNotification(String to, String message){
        this.emailService.sendEmail(to, message);
    }
}
