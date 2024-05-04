package ma.enset.tp2ormjdbc.repositories;

import ma.enset.tp2ormjdbc.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient,Long> {

    Patient findByNom(String name);
    List<Patient> findByNomContains(String ms);

    //Patient merge(Patient p);

    @Query("select p from Patient p where p.nom like :x")
    List<Patient> search(@Param("x") String mc);
}
