package io.github.gabrielpadilh4.msmail.controllers;

import io.github.gabrielpadilh4.msmail.dtos.MailDTO;
import io.github.gabrielpadilh4.msmail.models.MailModel;
import io.github.gabrielpadilh4.msmail.services.MailService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping("/send-mail")
    public ResponseEntity<MailModel> sendMail(@Valid @RequestBody MailDTO mailDTO) {
        MailModel mailModel = new MailModel();
        BeanUtils.copyProperties(mailDTO, mailModel);
        mailService.sendEmail(mailModel);
        return new ResponseEntity<>(mailModel, HttpStatus.CREATED);
    }
}
