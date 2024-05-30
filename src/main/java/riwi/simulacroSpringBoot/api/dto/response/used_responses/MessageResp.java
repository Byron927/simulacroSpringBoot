package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import riwi.simulacroSpringBoot.entities.Course;
import riwi.simulacroSpringBoot.entities.User;

import java.time.LocalDateTime;

public class MessageResp {
    private  Long id;
    private String message_content;
    private User sender_id;
    private LocalDateTime date;
    private User receiver_id;
    private Course course;
}
