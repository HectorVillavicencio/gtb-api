package com.villancio.gtb_api.persistence.crud;

import com.villancio.gtb_api.persistence.entity.Revision;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RevisionCrudRepository extends CrudRepository<Revision, Integer> {
    List<Revision> findByIdPasienteContainingIgnoreCase(int idPasiente);
    List<Revision> findByObservacionContainingIgnoreCase(String Observacion);

}
