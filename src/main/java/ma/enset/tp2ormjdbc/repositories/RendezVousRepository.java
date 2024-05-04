package ma.enset.tp2ormjdbc.repositories;

import ma.enset.tp2ormjdbc.entities.Patient;
import ma.enset.tp2ormjdbc.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,String> {

}
