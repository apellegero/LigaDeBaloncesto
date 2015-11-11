package com.example.Service;

/**
 * Created by jhipster on 8/10/15.
 */
import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Model.Temporada;
import com.example.Model.Liga;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.data.repository.query.Param;


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
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private TemporadaRepository temporadaRepository;
    @Autowired
    private LigaRepository ligaRepository;

    public void testJugador() {

        //Equipos
        Calendar e1 = new GregorianCalendar(1934, 1, 20);
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Chicago Bulls");
        equipo1.setFechaCreacion(e1.getTime());
        equipo1.setLocalidad("Chicago");
        equipoRepository.save(equipo1);

        Calendar e2 = new GregorianCalendar(1934, 1, 20);
        Equipo equipo2 = new Equipo();
        equipo1.setNombre("Toronto Raptors");
        equipo1.setFechaCreacion(e2.getTime());
        equipo1.setLocalidad("Toronto");
        equipoRepository.save(equipo2);
        //Jugadores
            //Equipo1
        Calendar c1 = new GregorianCalendar(1993, 12, 3);
        Jugador jugador1 = new Jugador();
        jugador1.setNombre("Mike");
        jugador1.setFecha(c1.getTime());
        jugador1.setCanastas(41);
        jugador1.setAsistencias(1);
        jugador1.setRebotes(5);
        jugador1.setPosicion("Base");
        jugador1.setEquipo(equipo1);
        jugadorRepository.save(jugador1);

        Calendar c2 = new GregorianCalendar(1973, 2, 1);
        Jugador jugador2 = new Jugador();
        jugador2.setNombre("Adolf");
        jugador2.setFecha(c2.getTime());
        jugador2.setCanastas(43);
        jugador2.setAsistencias(78);
        jugador2.setRebotes(44);
        jugador2.setPosicion("Alero");
        jugador2.setEquipo(equipo1);
        jugadorRepository.save(jugador2);

        Calendar c3 = new GregorianCalendar(1990, 5, 24);
        Jugador jugador3 = new Jugador();
        jugador3.setNombre("Sventopaulos");
        jugador3.setFecha(c3.getTime());
        jugador3.setCanastas(1);
        jugador3.setAsistencias(70);
        jugador3.setRebotes(120);
        jugador3.setPosicion("Pivot");
        jugador3.setEquipo(equipo1);
        jugadorRepository.save(jugador3);

        Calendar c4 = new GregorianCalendar(1987, 11, 9);
        Jugador jugador4 = new Jugador();
        jugador4.setNombre("Sven");
        jugador4.setFecha(c4.getTime());
        jugador4.setCanastas(111);
        jugador4.setAsistencias(21);
        jugador4.setRebotes(5);
        jugador4.setPosicion("Escolta");
        jugador4.setEquipo(equipo1);
        jugadorRepository.save(jugador4);

        Calendar c5 = new GregorianCalendar(1993, 12, 3);
        Jugador jugador5 = new Jugador();
        jugador5.setNombre("Maika");
        jugador5.setFecha(c1.getTime());
        jugador5.setCanastas(0);
        jugador5.setAsistencias(34);
        jugador5.setRebotes(24);
        jugador5.setPosicion("Alero-Pivot");
        jugador5.setEquipo(equipo1);
        jugadorRepository.save(jugador5);
            //Equipo2
        Calendar c11 = new GregorianCalendar(1983, 1, 13);
        Jugador jugador11 = new Jugador();
        jugador11.setNombre("Tosik");
        jugador11.setFecha(c11.getTime());
        jugador11.setCanastas(259);
        jugador11.setAsistencias(46);
        jugador11.setRebotes(0);
        jugador11.setPosicion("Base");
        jugador11.setEquipo(equipo2);
        jugadorRepository.save(jugador11);

        Calendar c12 = new GregorianCalendar(1985, 4, 15);
        Jugador jugador12 = new Jugador();
        jugador12.setNombre("Brian");
        jugador12.setFecha(c12.getTime());
        jugador12.setCanastas(40);
        jugador12.setAsistencias(100);
        jugador12.setRebotes(37);
        jugador12.setPosicion("Alero");
        jugador12.setEquipo(equipo2);
        jugadorRepository.save(jugador12);

        Calendar c13 = new GregorianCalendar(1981, 5, 11);
        Jugador jugador13 = new Jugador();
        jugador13.setNombre("Kim-soon-jun");
        jugador13.setFecha(c3.getTime());
        jugador13.setCanastas(40);
        jugador13.setAsistencias(100);
        jugador13.setRebotes(400);
        jugador13.setPosicion("Pivot");
        jugador13.setEquipo(equipo2);
        jugadorRepository.save(jugador13);

        Calendar c14 = new GregorianCalendar(1989, 9, 29);
        Jugador jugador14 = new Jugador();
        jugador14.setNombre("Kristian");
        jugador14.setFecha(c4.getTime());
        jugador14.setCanastas(80);
        jugador14.setAsistencias(200);
        jugador14.setRebotes(35);
        jugador14.setPosicion("Escolta");
        jugador14.setEquipo(equipo2);
        jugadorRepository.save(jugador14);

        Calendar c15 = new GregorianCalendar(1991, 3, 1);
        Jugador jugador15 = new Jugador();
        jugador15.setNombre("Jhon");
        jugador15.setFecha(c1.getTime());
        jugador15.setCanastas(20);
        jugador15.setAsistencias(74);
        jugador15.setRebotes(34);
        jugador15.setPosicion("Alero-Pivot");
        jugador15.setEquipo(equipo2);
        jugadorRepository.save(jugador15);

        //Temporada
        Temporada temporada1= new Temporada();
        temporada1.getEquipos().add(equipo1);
        temporada1.getEquipos().add(equipo2);
        temporadaRepository.save(temporada1);

        Temporada temporada2= new Temporada();
        temporada2.getEquipos().add(equipo1);
        temporada2.getEquipos().add(equipo2);
        temporadaRepository.save(temporada2);

        //Liga
        Liga liga1=new Liga("ACB");
        liga1.getTemporadas().add(temporada1);
        liga1.getTemporadas().add(temporada2);
        ligaRepository.save(liga1);

        //consultes
        Calendar c111 = new GregorianCalendar(1996, 7, 3);
        Calendar c121 = new GregorianCalendar(1990, 1, 1);
        System.out.println(jugadorRepository.findByNombreContaining("Mike"));
        System.out.println(jugadorRepository.findByCanastasGreaterThanEqual(5));
        System.out.println(jugadorRepository.findByAsistenciasIsBetween(9,2));
        System.out.println(jugadorRepository.findByPosicionLike("Alero"));
        System.out.println(jugadorRepository.findByFechaBefore(c111.getTime()));
        System.out.println(jugadorRepository.findByFechaBeforeAndCanastasGreaterThanEqual(c121.getTime(), 7));

        //****Consultas ex 2******
        //Consulta los equipos existentes en una localidad determinada.
        System.out.println(equipoRepository.findByLocalidadContaining("Toronto"));
        //Devuelve todos los jugadores de un equipo, a partir del nombre completo del equipo.
        System.out.println(jugadorRepository.findByNombre("Raptors"));
        //Devuelve todos los jugadores de un equipo, que además jueguen en la misma posición, por ejemplo, alero.
        System.out.println(jugadorRepository.findByPosicionAndNombre("Alero", "Chicago Bulls"));
        //Devuelve el jugador que más canastas ha conseguido del total de jugadores
        System.out.println(jugadorRepository.findTop1ByOrderByCanastasDesc());
        //Devuelve los cinco jugadores que más asistencias han efectuado
        System.out.println(jugadorRepository.findTop5ByOrderByAsistenciasDesc());
        //Devuelve el jugador que más canastas ha realizado de un equipo determinado como parámetro.
        System.out.println(jugadorRepository.findTop1ByCanastas("Raptors"));


        /*@Query("SELECT e FROM Employee e where w.project.descripcion = :projectName order by e.salary desc")
                list<Employee>  findEmployeeOrderBySalaryFromProject(@Param("projectName") String projectName);*/
    }

}
