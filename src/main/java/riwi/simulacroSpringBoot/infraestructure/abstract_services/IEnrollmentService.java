package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.EnrollmentReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.EnrollmentResp;

public interface IEnrollmentService extends CrudService<EnrollmentReq, EnrollmentResp, Long> {

}
