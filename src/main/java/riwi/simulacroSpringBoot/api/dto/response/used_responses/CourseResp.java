package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Enrollment;
import riwi.simulacroSpringBoot.domain.entities.Lesson;
import riwi.simulacroSpringBoot.domain.entities.Message;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResp {
    private Long id;
    private String name;
    private String description;
    private User user;
    private List<Enrollment> enrollments;
    private List<Message> messages;
    private List<Lesson> lessons;
}
