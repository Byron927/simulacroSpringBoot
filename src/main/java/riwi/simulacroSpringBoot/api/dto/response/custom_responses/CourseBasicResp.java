package riwi.simulacroSpringBoot.api.dto.response.custom_responses;

import riwi.simulacroSpringBoot.entities.Enrollment;
import riwi.simulacroSpringBoot.entities.Lesson;
import riwi.simulacroSpringBoot.entities.Message;

import java.util.List;

public class CourseBasicResp {
    private Long id;
    private String name;
    private String description;
    private List<Enrollment> enrollments;
    private List<Message> messages;
    private List<Lesson> lessons;

}
