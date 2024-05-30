package riwi.simulacroSpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import riwi.simulacroSpringBoot.enums.Role;

public class UserReq {


    private Long id;
    @NotBlank()
    private String username;
    private String password;
    private String email;
    private String full_name;
    private Role role;
}
