package com.example.Service;

/**
 * Created by jhipster on 28/10/15.
 */
import com.example.Model.Liga;
import com.example.Model.Temporada;
import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
public class LigaService {

    @Autowired
    private LigaRepository ligaRepository;

    @Autowired
    private TemporadaRepository temporadaRepository;

    public void testLiga() {

        /*Temporada temporada = temporadaRepository.findById(1L);
        Liga liga1=new Liga("ACB");
        liga1.getTemporadas().add(temporada);
        ligaRepository.save(liga1);*/

    }
}
