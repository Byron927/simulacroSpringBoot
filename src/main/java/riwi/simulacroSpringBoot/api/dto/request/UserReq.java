package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.util.enums.Role;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserReq {
    @NotBlank(message = "Username is required")
    @Size(max = 50, message = "Username must not exceed {max} characters.")
    private String username;

    @NotBlank(message = "Password is required")
    @Size(max = 20, message = "Password must not exceed {max} characters.")
    private String password;

    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email format.")
    @Size(max = 50, message = "Email must not exceed {max} characters.")
    private String email;

    @NotBlank(message = "Full name is required")
    @Size(max = 50, message = "Full name must not exceed {max} characters.")

    private String full_name;
    @NotNull(message = "Role is required.")

    private Role role;
}
