package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.domain.entities.Course;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.time.LocalDateTime;

public class EnrollmentResp {
    private Long id;
    private LocalDateTime enrollment_date;
    private Course course;
    private User user;
}
