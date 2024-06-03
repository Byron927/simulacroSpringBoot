package riwi.simulacroSpringBoot.api.dto.response.used_responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import riwi.simulacroSpringBoot.util.enums.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResp {
    private Long id;
    private String username;
    private String email;
    private String full_name;
    private Role role;
}
