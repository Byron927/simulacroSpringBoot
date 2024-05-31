package riwi.simulacroSpringBoot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.simulacroSpringBoot.domain.entities.Assignment;
@Repository
public interface AssingnmentRepository extends JpaRepository<Assignment, Long> {
}
