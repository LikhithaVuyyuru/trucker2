package io.enn.spring.complex;


import org.springframework.stereotype.Component;

@Component("awsService")
public class AWSEmailService implements EmailService {

    public AWSEmailService(){
        System.out.println("AWSEmailService Constructor");
    }

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("-----------------AWS EMAIL SERVICE-------------");
        System.out.println("Sending Email to: "+toAddress);
        System.out.println("Body: "+body);
        System.out.println("-----------------------------------------------");
    }
}
