package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Assignment;
import riwi.simulacroSpringBoot.domain.entities.User;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmissionReq {

    @NotBlank(message = "El contenido para realizar la entrega es requerido")
    @Size(max = 500)
    private String content;

    @NotBlank(message = "La fecha en la que se realizará el envío es requerida")
    private LocalDateTime submission_date;

    @NotBlank(message = "La nota del usuario es requerida")
    private double grade;

    @NotBlank(message = "El id del estudiante es requerido")
    private Long user;

    @NotBlank(message = "El id de la asignación es requerida")
    private Long assignment;
}
