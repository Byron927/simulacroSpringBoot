package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.domain.entities.User;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseReq {
    @NotBlank(message = "El nombre del curso es requerido")
    @Size(min = 10, max = 50)
    private String name;

    @NotBlank(message = "La descripción del curso es obligatoria")
    @Size(min = 100, max = 500)
    private String description;

    @NotBlank(message = "El id del instructor es requerido")
    private Long user;
}
