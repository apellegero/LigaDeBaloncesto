package com.example.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 14/10/15.
 */
//
@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected String nombre;

    @Column
    protected String localidad;

    @Column
    protected Date fechaCreacion;

    @JsonIgnore
    @OneToMany(mappedBy = "equipo")
    private Set<Jugador> jugadors = new HashSet<>();

    @JsonIgnore
    @ManyToMany
    private Set<Temporada> temporadas = new HashSet<>();

    public Equipo(){}

    public Equipo(String nombre, String Localidad, Date fechaCreacion){
        this.nombre=nombre;
        this.localidad =Localidad;
        this.fechaCreacion=fechaCreacion;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Set<com.example.Model.Jugador> getJugadors() {
        return jugadors;
    }

    public void setJugadors(Set<com.example.Model.Jugador> jugadors) {
        this.jugadors = jugadors;
    }

    public Set<com.example.Model.Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<com.example.Model.Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
