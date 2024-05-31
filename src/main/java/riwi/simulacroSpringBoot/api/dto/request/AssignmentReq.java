package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.Lesson;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AssignmentReq {
    @NotBlank(message = "El título de la asignación es requerido")
    @Size(min = 10, max = 30)
    private String assignment_title;

    @NotBlank(message = "El título de la asignación es requerido")
    @Size(min = 10, max = 30)
    private String description;

    @NotBlank(message = "La fecha de esta asignación es requerida")
    private LocalDateTime due_date;

    @NotBlank(message = "El id de la lección a la cual pertenece esta asignación es requerida")
    private Long lesson;
}
