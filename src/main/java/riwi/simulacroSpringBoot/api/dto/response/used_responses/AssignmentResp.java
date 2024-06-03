package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Lesson;
import riwi.simulacroSpringBoot.domain.entities.Submission;

import java.time.LocalDateTime;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentResp {
    private Long id;
    private String assignment_title;
    private String description;
    private LocalDateTime due_date;
    private List<Submission> submission;
    private Lesson lesson;
}
