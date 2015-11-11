package com.example.Model;
import javax.persistence.*;
import javax.persistence.Entity;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.example.Model.Liga;
/**
 * Created by jhipster on 21/10/15.
 */
@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    protected Long id;

    @Column
    protected Date any;

    @ManyToMany(mappedBy = "temporadas")
    private Set<Equipo> equipos = new HashSet<>();

    @ManyToOne
    private Liga ligas;

    public Temporada(){}

    public Temporada(Date any){
        this.any=any;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAny() {
        return any;
    }

    public void setAny(Date any) {
        this.any = any;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }
}
