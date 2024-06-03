package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Assignment;
import riwi.simulacroSpringBoot.domain.entities.Course;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LessonResp {
    private Long id;
    private String lesson_title;
    private String content;
    private Course course;
    private List<Assignment> assignment;
}
