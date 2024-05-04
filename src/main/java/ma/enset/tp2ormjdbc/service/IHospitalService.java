package ma.enset.tp2ormjdbc.service;

import ma.enset.tp2ormjdbc.entities.Consultation;
import ma.enset.tp2ormjdbc.entities.Medecin;
import ma.enset.tp2ormjdbc.entities.Patient;
import ma.enset.tp2ormjdbc.entities.RendezVous;
import ma.enset.tp2ormjdbc.repositories.MedecinRepository;

import java.util.List;

public interface IHospitalService {
    Patient savePatient(Patient patient);
    List<Patient> getAllPatient();
    Patient findPatientByNom(String name);
    Patient findPatientById(Long id);
    void deletePatient(Patient patient);

    Medecin saveMedcine(Medecin medecin);
    List<Medecin> getAllMedecin();
    Medecin findMedecinByNom(String name);
    void deleteMedecin(Medecin medecin);
    RendezVous saveRendezVous(RendezVous rendezVous);
    List<RendezVous> getAllRendezVous();
    void deleteRendezVous(RendezVous rendezVous);
    Consultation saveConsultation(Consultation consultation);
    List<Consultation> getAllConsultation();
    void deleteConsultation(Consultation consultation);
}
