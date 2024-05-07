package com.test.dockertest;


import com.cogentai.core.domain.Patient;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

@RestController
@RequestMapping("/jenkins")
public class Controller {

@Autowired
    JavaMailSender mailSender;
    @GetMapping("/run")
    public String  getData()
    {

        return Instant.now().toString();
    }

    public void sendHtmlMessage(String to, String subject, String htmlBody) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(htmlBody, true); // true indicates html

            for (int i = 1; i<=200; i++)
            {
                mailSender.send(message);
            }


        } catch (MessagingException e) {
            e.printStackTrace();
            // Handle exception as needed
        }
    }
}