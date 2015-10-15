package com.example.Model;
import javax.validation.constraints.*;
import javax.annotation.Generated;
import javax.persistence.*;
import java.util.Date;

/**
 * Created by jhipster on 14/10/15.
 */
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String nombre;

    @Column
    protected String Localidad;

    @Column
    protected Date fechaCreacion;

    public Equipo(){}

    public Equipo(String nombre, String Localidad, Date fechaCreacion){

    }

}
