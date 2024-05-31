package riwi.simulacroSpringBoot.infraestructure.abstract_services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import riwi.simulacroSpringBoot.util.enums.SortType;

@Service
//una clase implementa de una interfaz y una interfaz extiende de otra interfaz
public interface CrudService<RQ, RS, ID> {
    RS create(RQ request);

    RS get(ID id);

    RS update(RQ request, ID id);

    void delete(ID id);

    Page<RS> getAll(int page, int size, SortType sort);
}
