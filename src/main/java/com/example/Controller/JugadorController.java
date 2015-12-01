package com.example.Controller;

import com.example.Exception.JugadorException;
import com.example.Model.Jugador;
import com.example.Model.Equipo;
import com.example.Repository.JugadorRepository;
import com.example.Repository.EquipoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
/**
 * Created by jhipster on 12/11/15.
 */
@RestController
@RequestMapping("/Jugador")
public class JugadorController {

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;

    @RequestMapping(method= RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador save(@RequestBody Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(method= RequestMethod.GET)
    public List<Jugador> findAll() {
        List<Jugador> jugador = new ArrayList<Jugador>();
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator();

        while (iterator.hasNext())jugador.add(iterator.next());

        return jugador;
    }

    @RequestMapping(value= "/{id}", method = GET)
    public Jugador getById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);

        if (jugador == null) throw new JugadorException(id);

        return jugador;
    }

    @RequestMapping(value= "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);

        if (jugador == null) throw new JugadorException(id);

        jugadorRepository.delete(id);

    }
    @RequestMapping(value= "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id,@RequestBody Jugador jugador) {

        if (jugadorRepository.findOne(id) == null)
            throw new JugadorException(id);

        jugador = jugadorRepository.save(jugador);
        return jugador;
    }

    @RequestMapping(value = "/{idJugador}/Equipo/{idEquipo}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public Jugador addManager(@PathVariable Long idJugador, @RequestBody Jugador jugador) {
        if (jugadorRepository.findOne(idJugador) == null) throw new JugadorException(idJugador);
        return jugadorRepository.save(jugador);
    }

    @RequestMapping(value = "/{idJugador}/equipo", method = RequestMethod.GET)
    public Equipo getByEquipo(@PathVariable Long idJugador) {
        Jugador jugador = jugadorRepository.findOne(idJugador);

        if (jugador == null) throw new JugadorException(idJugador);

        return jugador.getEquipo();

    }


}
