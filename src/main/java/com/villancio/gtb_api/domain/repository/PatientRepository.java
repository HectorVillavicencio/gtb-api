package com.villancio.gtb_api.domain.repository;

import com.villancio.gtb_api.domain.dto.Patient;
import com.villancio.gtb_api.domain.dto.Review;

import java.util.List;
import java.util.Optional;

public interface PatientRepository {
    List<Patient> getAll();
    Optional<Patient> getPatient(int idPatient);
    Optional<List<Patient>> findByIdPatient(int idPatient);
    Optional<List<Patient>> findByObservation(String observacion);
    Patient save(Patient patient);
    void delete(int Patient);
}
