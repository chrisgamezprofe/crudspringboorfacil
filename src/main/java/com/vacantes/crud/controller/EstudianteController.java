package com.vacantes.crud.controller;

import com.vacantes.crud.model.EstudianteModel;
import com.vacantes.crud.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping()
    public ArrayList<EstudianteModel> listarTodos(){
        return estudianteService.getAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<EstudianteModel> consultarPorId(@PathVariable("id") Long id){
        return estudianteService.get(id);
    }

    @GetMapping(path = "/consultar")
    public ArrayList<EstudianteModel> consultarPorDNI(@RequestParam("dni") String dni){
        return estudianteService.getByDNI(dni);
    }

    @PostMapping()
    public EstudianteModel registrar(@RequestBody  EstudianteModel e){
        return estudianteService.save(e);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> eliminar(@PathVariable("id") Long id){
        boolean res = estudianteService.delete(id);
        Map datos = new HashMap<>();
        datos.put("mensaje","Datos eliminados con éxito!!!");
        if(!res){
            datos.put("mensaje","No existe el registro con id:"+id);
        }

        datos.put("respuesta",res);
        return new ResponseEntity<Object>(datos, HttpStatus.OK);

    }
}
