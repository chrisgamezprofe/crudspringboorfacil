package com.vacantes.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_estudiantes")
public class EstudianteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "documento",unique = true, length = 15,nullable = false)
    private String DNI;

    @Column(length = 50,nullable = false)
    private String nombre;
    @Column(length = 50,nullable = false)
    private String apellido;
    @Column(length = 50,unique = true,nullable = false)
    private String correo;

    public EstudianteModel() {
    }

    public EstudianteModel(long id, String DNI, String nombre, String apellido, String correo) {
        this.id = id;
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public EstudianteModel(String DNI, String nombre, String apellido, String correo) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
