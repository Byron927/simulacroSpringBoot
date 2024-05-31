package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.domain.entities.Lesson;
import riwi.simulacroSpringBoot.domain.entities.Submission;

import java.time.LocalDateTime;
import java.util.List;

public class AssignmentResp {
    private Long id;
    private String assignment_title;
    private String description;
    private LocalDateTime due_date;
    private List<Submission> submission;
    private Lesson lesson;

}
