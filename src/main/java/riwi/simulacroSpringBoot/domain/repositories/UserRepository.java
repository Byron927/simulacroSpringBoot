package riwi.simulacroSpringBoot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.simulacroSpringBoot.domain.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
