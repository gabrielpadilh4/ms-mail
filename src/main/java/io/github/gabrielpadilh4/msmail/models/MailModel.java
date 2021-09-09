package io.github.gabrielpadilh4.msmail.models;

import io.github.gabrielpadilh4.msmail.enums.StatusMail;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "MAIL_RECORD")
public class MailModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID mailId;
    private String ownerReference;
    private String mailFrom;
    private String mailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String body;
    private LocalDateTime sendDateMail;
    private StatusMail statusMail;
    @Column(columnDefinition = "TEXT")
    private String errorMessage;
}
