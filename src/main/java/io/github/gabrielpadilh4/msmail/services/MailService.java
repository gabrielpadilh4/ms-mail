package io.github.gabrielpadilh4.msmail.services;

import io.github.gabrielpadilh4.msmail.enums.StatusMail;
import io.github.gabrielpadilh4.msmail.models.MailModel;
import io.github.gabrielpadilh4.msmail.repositories.MailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class MailService {

    @Autowired
    MailRepository mailRepository;

    @Autowired
    private JavaMailSender mailSender;

    public MailModel sendEmail(MailModel mailModel) {

        mailModel.setSendDateMail(LocalDateTime.now());

        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(mailModel.getMailFrom());
            message.setTo(mailModel.getMailTo());
            message.setSubject(mailModel.getSubject());
            message.setText(mailModel.getBody());
            mailSender.send(message);

            mailModel.setStatusMail(StatusMail.SENT);

        } catch (Exception ex) {
            mailModel.setErrorMessage(ex.getMessage());
            mailModel.setStatusMail(StatusMail.ERROR);

        } finally {
            return mailRepository.save(mailModel);
        }
    }
}
