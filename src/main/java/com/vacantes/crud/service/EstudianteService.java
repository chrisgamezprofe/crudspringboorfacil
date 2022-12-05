package com.vacantes.crud.service;

import com.vacantes.crud.model.EstudianteModel;
import com.vacantes.crud.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> getAll(){
        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }

    public ArrayList<EstudianteModel> getByDNI(String dni){
        return estudianteRepository.findByDNI(dni);
    }

    public Optional<EstudianteModel> get(long id){
        return estudianteRepository.findById(id);
    }

    public EstudianteModel save(EstudianteModel e){
        return estudianteRepository.save(e);
    }

    public boolean delete(Long id){
        try{
            estudianteRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }
}
