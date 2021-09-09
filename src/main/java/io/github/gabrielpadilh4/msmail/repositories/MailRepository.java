package io.github.gabrielpadilh4.msmail.repositories;

import io.github.gabrielpadilh4.msmail.models.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MailRepository extends JpaRepository<MailModel, UUID> {
}
