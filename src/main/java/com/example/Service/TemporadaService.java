package com.example.Service;
import com.example.Model.Liga;
import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import com.example.Model.Temporada;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.List;
/**
 * Created by jhipster on 29/10/15.
 */
@Service
@Transactional
public class TemporadaService {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private  EquipoRepository equipoRepository;

    public void testTemporada() {

        /*Equipo equipo1 = equipoRepository.findById(1L);
        Temporada temporada= new Temporada();
        temporada.getEquipos().add(equipo1);
        temporadaRepository.save(temporada);*/

    }
}
