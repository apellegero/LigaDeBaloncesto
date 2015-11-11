package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;
/**
 * Created by jhipster on 8/10/15.
 */
public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {


    public List<Jugador> findByNombreContaining (String nombre);
    public List<Jugador> findByCanastasGreaterThanEqual (int canastas);
    public List<Jugador> findByAsistenciasIsBetween (int max,int min);
    public List<Jugador> findByPosicionLike (String posicion);
    public List<Jugador> findByFechaBefore (Date fecha);
    public List<Jugador> findByFechaBeforeAndCanastasGreaterThanEqual (Date fecha, int canasta);

    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :projectName")
    public List<Jugador>  findByNombre(@Param("projectName") String projectName);

    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :nomEquip and j.posicion = :pos")
    public List<Jugador>  findByPosicionAndNombre(@Param("pos") String pos, @Param("nomEquip") String nomEquip);

    public List<Jugador> findTop1ByOrderByCanastasDesc ();

    public List<Jugador> findTop5ByOrderByAsistenciasDesc ();

    @Query("SELECT j FROM Jugador j where j.equipo.nombre = :projectName")
    public List<Jugador>  findTop1ByCanastas(@Param("projectName") String projectName);


}
