package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.domain.entities.Assignment;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.time.LocalDateTime;

public class SubmissionResp {
    private Long submission_id;
    private String content;
    private LocalDateTime submission_date;
    private double grade;
    private User user;
    private Assignment assignment;

}
