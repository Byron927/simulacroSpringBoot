package riwi.simulacroSpringBoot.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import riwi.simulacroSpringBoot.domain.entities.Submission;

@Repository
public interface SubmissionRepository extends JpaRepository<Submission, Long> {
}
