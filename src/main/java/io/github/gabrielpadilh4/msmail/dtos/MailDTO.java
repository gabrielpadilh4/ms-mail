package io.github.gabrielpadilh4.msmail.dtos;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class MailDTO {

    @NotBlank
    private String ownerReference;
    @NotBlank
    @Email
    private String mailFrom;
    @NotBlank
    @Email
    private String mailTo;
    @NotBlank
    private String subject;
    @NotBlank
    private String body;
}
