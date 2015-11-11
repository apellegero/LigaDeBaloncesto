package com.example.Service;

/**
 * Created by jhipster on 22/10/15.
 */
import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
@Transactional
public class EquipoService {
    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo() {

       //esta amb jugador. Primer es crea el equip i despres s'afageixen els jugadors

    }

}
