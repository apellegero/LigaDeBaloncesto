package com.example.Repository;

        import com.example.Model.Equipo;
        import com.example.Model.Jugador;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.repository.query.Param;

        import java.util.Date;
        import java.util.List;
/**
 * Created by jhipster on 22/10/15.
 */
public interface EquipoRepository extends PagingAndSortingRepository<Equipo, Long>{
        public Equipo findById(Long id);

        public Equipo findByLocalidadContaining(String Localidad);

}
