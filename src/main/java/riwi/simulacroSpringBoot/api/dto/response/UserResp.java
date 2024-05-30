package riwi.simulacroSpringBoot.api.dto.response;

import riwi.simulacroSpringBoot.entities.Course;
import riwi.simulacroSpringBoot.entities.Enrollment;
import riwi.simulacroSpringBoot.enums.Role;

import java.util.List;

public class UserResp {
    private Long id;

    private String username;
    private String email;
    private String full_name;
    private Role role;
    private List<Enrollment> enrollments;
    private List<Course> courses;


}
