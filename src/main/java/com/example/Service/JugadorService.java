package com.example.Service;

/**
 * Created by jhipster on 8/10/15.
 */
import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
public class JugadorService {
    @Autowired
    private JugadorRepository jugadorRepository;

    public void testJugador() {

        Calendar c1 = new GregorianCalendar(1993, 12, 3);
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Mike");
        jugador1.setFecha(c1.getTime());
        jugador1.setCanastas(41);
        jugador1.setAsistencias(1);
        jugador1.setRebotes(5);
        jugador1.setPosicion("Base");
        jugadorRepository.save(jugador1);

        Calendar c2 = new GregorianCalendar(1973, 2, 1);
        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Adolf");
        jugador2.setFecha(c2.getTime());
        jugador2.setCanastas(43);
        jugador2.setAsistencias(78);
        jugador2.setRebotes(44);
        jugador2.setPosicion("Alero");
        jugadorRepository.save(jugador2);

        Calendar c3 = new GregorianCalendar(1990, 5, 24);
        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Sventopaulos");
        jugador3.setFecha(c3.getTime());
        jugador3.setCanastas(1);
        jugador3.setAsistencias(70);
        jugador3.setRebotes(120);
        jugador3.setPosicion("Pivot");
        jugadorRepository.save(jugador3);

        Calendar c4 = new GregorianCalendar(1987, 11, 9);
        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Sven");
        jugador4.setFecha(c4.getTime());
        jugador4.setCanastas(111);
        jugador4.setAsistencias(21);
        jugador4.setRebotes(5);
        jugador4.setPosicion("Escolta");
        jugadorRepository.save(jugador4);

        Calendar c5 = new GregorianCalendar(1993, 12, 3);
        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Maika");
        jugador5.setFecha(c1.getTime());
        jugador5.setCanastas(0);
        jugador5.setAsistencias(34);
        jugador5.setRebotes(24);
        jugador5.setPosicion("Alero-Pivot");
        jugadorRepository.save(jugador5);

        Calendar c11 = new GregorianCalendar(1996, 7, 3);
        Calendar c12 = new GregorianCalendar(1990, 1, 1);

        System.out.println(jugadorRepository.findByNombreContaining("Mike"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(5));
        System.out.println(jugadorRepository.findByAsistenciasIsBetween(9,2));
        System.out.println(jugadorRepository.findByPosicionLike("Alero"));
        System.out.println(jugadorRepository.findByFechaBefore(c11.getTime()));
        System.out.println(jugadorRepository.findByFechaBeforeAndCanastasGreaterThanEqual(c12.getTime(), 7));
    }

}
