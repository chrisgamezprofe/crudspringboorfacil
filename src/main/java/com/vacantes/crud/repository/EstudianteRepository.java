package com.vacantes.crud.repository;

import com.vacantes.crud.model.EstudianteModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel,Long> {
    public abstract ArrayList<EstudianteModel> findByDNI(String dni);
}
