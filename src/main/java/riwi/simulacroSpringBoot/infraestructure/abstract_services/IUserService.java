package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.UserReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.UserResp;

public interface IUserService extends CrudService<UserReq,UserResp, Long>{

}
