package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.entities.Assignment;
import riwi.simulacroSpringBoot.entities.Course;

import java.util.List;

public class LessonResp {
    private Long id;
    private String lesson_title;
    private String content;
    private Course course;
    private List<Assignment> assignment;

}
