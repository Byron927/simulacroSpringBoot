package riwi.simulacroSpringBoot.api.dto.response.custom_responses;

import riwi.simulacroSpringBoot.entities.Course;

import java.time.LocalDateTime;

public class EnrollmentBasicResp {
    private Long id;
    private LocalDateTime enrollment_date;
    private Course course;
}
