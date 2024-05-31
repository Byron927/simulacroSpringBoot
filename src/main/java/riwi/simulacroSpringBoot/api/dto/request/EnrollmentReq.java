package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnrollmentReq {

    @NotBlank(message = "La fecha de inscripción es obligatoria")
    private LocalDate date;

    @NotBlank(message = "El id del usuario que va a realizar la inscripción es obligatorio")
    private Long idStudent;

    @NotBlank(message = "El id del curso al cual se realizará la inscripción es obligatorio")
    private Long idCourse;
}
