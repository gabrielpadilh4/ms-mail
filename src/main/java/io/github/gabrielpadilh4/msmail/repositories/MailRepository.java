package io.github.gabrielpadilh4.msmail.repositories;

import io.github.gabrielpadilh4.msmail.models.MailModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MailRepository extends JpaRepository<MailModel, Long> {
}
