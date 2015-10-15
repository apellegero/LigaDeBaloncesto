package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;

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
}
