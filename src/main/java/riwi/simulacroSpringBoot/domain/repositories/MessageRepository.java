package riwi.simulacroSpringBoot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.simulacroSpringBoot.domain.entities.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
