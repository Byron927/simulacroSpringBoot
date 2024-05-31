package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.AssignmentReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.AssignmentResp;

public interface IAssignmentService extends CrudService<AssignmentReq, AssignmentResp, Long> {

}
