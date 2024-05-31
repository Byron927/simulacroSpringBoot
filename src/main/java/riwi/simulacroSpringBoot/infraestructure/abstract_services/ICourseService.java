package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.CourseReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.CourseResp;

public interface ICourseService extends CrudService<CourseResp, CourseReq, Long>{

}
