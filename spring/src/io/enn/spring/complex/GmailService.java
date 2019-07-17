package io.enn.spring.complex;

import org.springframework.stereotype.Component;

@Component("gmailService")
public class GmailService implements EmailService {
    public GmailService() {
        System.out.println("GmailService Constructor");
    }

    @Override
    public void sendEmail(String toAddress, String body) {
        System.out.println("------------------------GMAIL SERVICE----------------------");
        System.out.println("Sending to: "+toAddress);
        System.out.println("Body: "+body);
        System.out.println("-----------------------------------------------------------");
    }
}
