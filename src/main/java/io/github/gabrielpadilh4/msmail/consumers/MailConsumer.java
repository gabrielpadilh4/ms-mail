package io.github.gabrielpadilh4.msmail.consumers;

import io.github.gabrielpadilh4.msmail.dtos.MailDTO;
import io.github.gabrielpadilh4.msmail.models.MailModel;
import io.github.gabrielpadilh4.msmail.services.MailService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MailConsumer {

    @Autowired
    MailService mailService;

    @RabbitListener(queues = "${spring.rabbitmq.queue}")
    public void listen(@Payload MailDTO mailDTO) {
        MailModel mailModel = new MailModel();
        BeanUtils.copyProperties(mailDTO, mailModel);
        mailService.sendEmail(mailModel);
        System.out.println("Email status: " + mailModel.getStatusMail().toString());
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
