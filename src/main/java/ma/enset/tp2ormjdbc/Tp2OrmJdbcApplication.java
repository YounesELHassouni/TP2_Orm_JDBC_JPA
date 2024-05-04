package ma.enset.tp2ormjdbc;

import ma.enset.tp2ormjdbc.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp2OrmJdbcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(Tp2OrmJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {






        /*
        patientRepository.save(new Patient(null ,"Ahmed",new Date(2000,10,1),true,15));
        patientRepository.save(new Patient(null ,"Ali",new Date(2001,06,15),false,12));
        patientRepository.save(new Patient(null ,"Said",new Date(2002,03,3),true,10));
        List<Patient> patients= patientRepository.findAll();
        patients.forEach(patient -> {
            System.out.println(patient.toString());
        });
        Patient patient = patientRepository.findById(Long.valueOf(1)).get();
        System.out.println("******************");
        System.out.println(patient.getId());
        System.out.println(patient.getNom());
        System.out.println(patient.getDateNaissance());
        System.out.println((patient.getMalade()?"malade":"non-malade"));
        System.out.println(patient.getScore());
        System.out.println("******************");

        System.out.println("Mettre à jour un patient :");
        patient.setMalade(false);
        //patientRepository.
        System.out.println("******************");
        System.out.println("Supprimer un patient :");
        patientRepository.delete(patient);

                // findByNomContains
        List<Patient> patientList =patientRepository.findByNomContains("i");
        patientList.forEach(p->{
            System.out.println(p);
        });

                //search
        List<Patient> patientList =patientRepository.search("i");
        patientList.forEach(p->{
            System.out.println(p);
        });


        //Before Update
        List<Patient> patientList =patientRepository.findAll();
        patientList.forEach(p->{
            System.out.println(p);
        });
        System.out.println("**************************");
        //After update

        Patient patientUpdated = patientRepository.search("Ahmed").get(0);
        patientUpdated.setMalade(false);
        patientRepository.merge(patientUpdated);

        patientList =patientRepository.findAll();
        patientList.forEach(p->{
            System.out.println(p);
        });

         */









    }
}
