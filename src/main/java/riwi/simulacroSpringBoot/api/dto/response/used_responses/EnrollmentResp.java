package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.entities.Course;
import riwi.simulacroSpringBoot.entities.User;

import java.time.LocalDateTime;

public class EnrollmentResp {
    private Long id;
    private LocalDateTime enrollment_date;
    private Course course;
    private User user;

}
