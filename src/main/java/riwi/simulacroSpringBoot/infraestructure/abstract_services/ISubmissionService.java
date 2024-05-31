package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.SubmissionReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.SubmissionResp;

public interface ISubmissionService extends CrudService<SubmissionReq, SubmissionResp, Long> {

}
