package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Course;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentResp {
    private Long id;
    private LocalDateTime enrollment_date;
    private Course course;
    private User user;
}
