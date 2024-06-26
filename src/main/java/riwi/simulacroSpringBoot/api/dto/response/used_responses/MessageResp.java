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
public class MessageResp {
    private  Long id;
    private String message_content;
    private User sender_id;
    private LocalDateTime date;
    private User receiver_id;
    private Course course;
}
