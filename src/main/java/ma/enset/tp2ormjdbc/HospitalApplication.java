package ma.enset.tp2ormjdbc;

import ma.enset.tp2ormjdbc.entities.*;
import ma.enset.tp2ormjdbc.repositories.ConsultationRepository;
import ma.enset.tp2ormjdbc.repositories.MedecinRepository;
import ma.enset.tp2ormjdbc.repositories.PatientRepository;
import ma.enset.tp2ormjdbc.repositories.RendezVousRepository;
import ma.enset.tp2ormjdbc.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication {
    public static void main(String[] args) {
        SpringApplication.run(HospitalApplication.class, args);
    }
    @Bean
    CommandLineRunner start(IHospitalService hospitalService){
        return args -> {
            /*
            Stream.of("Ahmed","Ali","Said").forEach(name->{
                Patient patient = new Patient();
                patient.setNom(name);
                patient.setDateNaissance(new Date());
                patient.setMalade(false);
                patient.setScore(10);
            });

             */
            hospitalService.savePatient(new Patient(null ,"Ahmed",new Date(2000,10,1),false,15,null));
            hospitalService.savePatient(new Patient(null ,"Ali",new Date(2001,06,15),false,12,null));
            hospitalService.savePatient(new Patient(null ,"Said",new Date(2002,03,3),false,10,null));

            Stream.of("Younes","Amine","Rachid").forEach(name->{
                Medecin medecin = new Medecin();
                medecin.setNom(name);
                medecin.setSpecielite(Math.random()>0?"Cardio":"Dentiste");
                medecin.setEmail(name+"@gmail.com");
                hospitalService.saveMedcine(medecin);
            });

            Patient patient = hospitalService.findPatientById(1L);
            //System.out.println(patient);
            Patient patient1 = hospitalService.findPatientByNom("Ahmed");
            //System.out.println(patient1);

            Medecin medecin = hospitalService.findMedecinByNom("Amine");

            RendezVous rendezVous = new RendezVous();
            rendezVous.setDate(new Date());
            rendezVous.setStatus(StatusRDV.PENDING);
            rendezVous.setMedecin(medecin);
            rendezVous.setPatient(patient1);
            RendezVous saveRDV = hospitalService.saveRendezVous(rendezVous);
            System.out.println(saveRDV.getId());
            RendezVous rendezVous1 = hospitalService.getAllRendezVous().get(0);
            Consultation consultation = new Consultation();
            consultation.setDateConsultation(new Date());
            consultation.setRendezVous(rendezVous1);
            consultation.setRapport("Rapport de Consultation ....");
            hospitalService.saveConsultation(consultation);



        };
    }

}
