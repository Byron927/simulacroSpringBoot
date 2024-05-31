package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.LessonReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.LessonResp;

public interface ILessonService extends CrudService<LessonReq, LessonResp, Long> {

}
