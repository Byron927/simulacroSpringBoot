package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import riwi.simulacroSpringBoot.api.dto.request.MessageReq;
import riwi.simulacroSpringBoot.api.dto.response.used_responses.MessageResp;

public interface IMessageService extends CrudService<MessageReq, MessageResp, Long>{

}
