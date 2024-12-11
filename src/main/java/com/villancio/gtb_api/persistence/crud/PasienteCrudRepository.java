package com.villancio.gtb_api.persistence.crud;

import com.villancio.gtb_api.persistence.entity.Pasiente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasienteCrudRepository extends CrudRepository<Pasiente, Integer> {
    List<Pasiente> findByNombreContainingIgnoreCase(String nombre);
    List<Pasiente> findByBarrioContainingIgnoreCase(String barrio);

}
