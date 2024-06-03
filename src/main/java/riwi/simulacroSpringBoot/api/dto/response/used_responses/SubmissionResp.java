package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Assignment;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionResp {
    private Long submission_id;
    private String content;
    private LocalDateTime submission_date;
    private double grade;
    private User user;
    private Assignment assignment;
}
