package riwi.simulacroSpringBoot.infraestructure.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import riwi.simulacroSpringBoot.api.dto.request.UserReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.UserResp;
import riwi.simulacroSpringBoot.domain.entities.User;
import riwi.simulacroSpringBoot.domain.repositories.UserRepository;
import riwi.simulacroSpringBoot.infraestructure.abstract_services.IUserService;
import riwi.simulacroSpringBoot.util.enums.SortType;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    //Inyección de dependencias, final es una constante y nos obliga a crear un constructor
    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserResp create(UserReq request) {
        return null;
    }

    @Override
    public UserResp get(Long aLong) {
        return null;
    }

    @Override
    public UserResp update(UserReq request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<UserResp> getAll(int page, int size, SortType sort)
    {
        if (page<0)
            page = 0;

        PageRequest pagination = PageRequest.of(page, size);

        return this.userRepository.findAll(pagination).map(user -> this.);
    }

    private UserResp entityToResponse(User entity) {
    //creamos instancia de UserResponse
        UserResp response = new UserResp();

        BeanUtils.copyProperties(entity, response);

        return response;
    }

}
