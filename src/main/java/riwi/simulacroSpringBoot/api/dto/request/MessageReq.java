package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
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
public class MessageReq {
    @NotBlank(message = "El contenido del mensaje no puede ser nulo")
    private String message_content;

    @NotBlank(message = "La hora y fecha del mensaje son requeridas")
    private LocalDateTime date;

    @NotBlank(message = "El id de los mensajes enviados del usuario es requerido")
    private User sender_id;

    @NotBlank(message = "El id de los mensajes recibidos del usuario es requerido")
    private User receiver_id;

    @NotBlank(message = "El id del curso del usuario es requerido")
    private Long course;
}
