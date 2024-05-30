package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.entities.Enrollment;
import riwi.simulacroSpringBoot.entities.Lesson;
import riwi.simulacroSpringBoot.entities.Message;
import riwi.simulacroSpringBoot.entities.User;

import java.util.List;

public class CourseResp {
    private Long id;
    private String name;
    private String description;
    private User user;
    private List<Enrollment> enrollments;
    private List<Message> messages;
    private List<Lesson> lessons;

}
